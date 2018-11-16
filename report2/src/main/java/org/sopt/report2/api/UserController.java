package org.sopt.report2.api;

import org.sopt.report2.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final static List<User> userList = new LinkedList<>();

    /**
     * Method : GET
     * 현재 시간 반환
     **/
    @GetMapping("/")
    public String getNowTime(){
        return new Date().toString();
    }

    /**
     * Method : GET
     * 회원 조회(모든 회원, 이름으로 조회, 파트로 조회)
     **/
    @GetMapping("/users")
    public String getUserList(@RequestParam(value = "name") final Optional<String> name,
                              @RequestParam(value = "part") final Optional<String> part) {
        if (name.isPresent()) {
            for (User u : userList) {
                if (u.getName().equals(name.get()))
                    return u.toString();
            }
            return "없습니다.";
        }
        else if (part.isPresent()) {
            for (User u : userList){
                if (u.getPart().equals(part.get()))
                    return u.toString();
            }
            return "없습니다.";
        } else {
            if(userList.isEmpty())
                return "등록된 회원이 없습니다.";
            else {
                return userList.toString();
            }
        }
    }

    /**
     * Method : GET
     * 회원 Id로 회원 조회
     **/
    @GetMapping("/users/{user_idx}")
    public String getUserByIdx(@PathVariable(value = "user_idx") final int userIdx) {
        for (User u : userList){
            if (u.getUser_idx() == userIdx)
                return u.toString();
         }
        return "없습니다.";
    }

    /**
     * Method : POST
     * 회원 저장 O
     */
    @PostMapping("/users")
    public String saveUser(@RequestBody final User user) {
        userList.add(user);
        return "회원 저장 성공";
    }

    /**
     * Method : PUT
     * 회원 정보 수정
     **/
    @PutMapping("/users/{user_idx}")
    public String updateUser(@PathVariable(value = "user_idx") final int userIdx,
                             @RequestBody final User user) {
        for (User u : userList) {
            if (u.getUser_idx() == userIdx) {
                userList.remove(u);
                userList.add(user);
                return "회원 정보 수정 성공";
            }
        }
        return "회원 정보 수정 실패";
    }

    /**
     * Method : DELETE
     * 회원 삭제
     **/
    @DeleteMapping("/users/{user_idx}")
    public String deleteUser(@PathVariable(value = "user_idx") final int userIdx) {
        for (User u : userList) {
            if (u.getUser_idx() == userIdx) {
                userList.remove(u);
                return "회원 삭제 성공";
            }
        }
        return "회원 삭제 실패";
    }
}
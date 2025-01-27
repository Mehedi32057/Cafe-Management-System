package com.inn.cafe.restimpl;

import com.inn.cafe.rest.UserRest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestImpl implements UserRest {
    @Override
    public ResponseEntity<String> signup(Map<String, String> requestMap) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

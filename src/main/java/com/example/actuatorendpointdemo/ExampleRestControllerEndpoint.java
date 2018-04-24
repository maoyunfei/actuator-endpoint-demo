package com.example.actuatorendpointdemo;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/4/24
 */
@Component
@RestControllerEndpoint(id = "example")
public class ExampleRestControllerEndpoint {
    @GetMapping("/echo")
    public ResponseEntity<String> echo(@RequestParam("text") String text) {
        return ResponseEntity.ok().header("echo", text).body(text);
    }
}

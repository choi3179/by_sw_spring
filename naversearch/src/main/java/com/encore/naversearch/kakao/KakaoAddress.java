package com.encore.naversearch.kakao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpClient;

@Component
public class KakaoAddress {

    @Value("${kakao.api_key}")
    String api_key = "";

    @Value("${kakao.url}")
    String search_url = "";

    public void search(String keyword, int page) {
        String url = search_url + "?query=" + keyword + "&page=" + page + "&analyze_type=similar";

        RestTemplate restTemplate = new RestTemplate();

        try{
            var headers = new HttpHeaders();
            headers.set("Authorization", "KakaoAK " + api_key);
            headers.setContentType(MediaType.APPLICATION_JSON);     // 전송 타입 지정 - JSON

            var httpEntity = new HttpEntity<>(headers);
            ResponseEntity<String> response = restTemplate.exchange(
                    url, HttpMethod.GET, httpEntity, String.class
            );

            System.out.println(response);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

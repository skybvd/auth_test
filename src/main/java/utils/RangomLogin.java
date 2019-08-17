package utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RangomLogin {

        public static String generateRandomString() {
            return RandomStringUtils.random(6, "abcdefghjklmnopqrstuvwxyz");
        }

        public static String generateRandomEmail() {
            return generateRandomString() + "@mail.ru";
        }

}

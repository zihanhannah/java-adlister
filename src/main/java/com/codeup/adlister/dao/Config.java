package com.codeup.adlister.dao;

class Config {
        public String getUrl() {
            return "jdbc:mysql://localhost/adlister_db?serverTimezone=UTC&useSSL=false";
        }
        public String getUser() {
            return "test_user";
        }
        public String getPassword() {
            return "password";
        }
}

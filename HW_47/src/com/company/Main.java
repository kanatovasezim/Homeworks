package com.company;

public class Main {

    public static void main(String[] args) {
	DB db = new DB();
	User user1 = new User(1, "sezimk", "sezimk@esca.kg", "234");
	User user2 = new User(2, "begimayd", "begimayd@esca.kg", "232313");
	User user3 = new User(2, "akylair", "akylair@esca.kg", "232314");
//	db.register(user1);
//	db.register(user2);
//	db.register(user3);
//	db.authorize("sezimk", "234");
	db.authorize("begimayd", "234");





    }
}

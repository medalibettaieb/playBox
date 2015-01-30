package tn.edu.esprit.cs.playBox.tests;

import tn.edu.esprit.cs.playBox.util.MyConnectionMysql;

public class TestGiveMeConnection {
public static void main(String[] args) {
	MyConnectionMysql.giveMeConnection();
	MyConnectionMysql.giveMeStatement();
}
}

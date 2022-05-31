package spellchecker;

import java.util.ArrayList;
import java.lang.Thread;
import java.io.EOFException;
import java.io.IOException;

import javax.swing.*;

import spellchecker.models.*;

public class Launcher {
	public static void main(String[] args) {
		Checker check = new Checker();
		check.start();
  	}
}

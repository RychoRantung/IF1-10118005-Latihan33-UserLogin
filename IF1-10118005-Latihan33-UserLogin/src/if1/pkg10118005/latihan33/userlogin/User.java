/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan33.userlogin;

/**
 *
 * @author USER
 */
public class User {
    final private String username;
	final private String password;
	private boolean statusAkun;

	private boolean cekAkun(String parUserName, String parPassword){
		return this.username.equals(parUserName) && this.password.equals(parPassword);
	}
	private void hasilLogin(boolean status, String parUserName){
		if(status)
			System.out.printf("\n******HALLO %s******\nSelamat Datang di Aplikasi ini\n", parUserName.toUpperCase());
		else
			System.out.printf("\nOoops, Username atau Password anda salah\n");
	}
	public void pengecekkanLogin(String parUserName, String parPassword){
		statusAkun = cekAkun(parUserName, parPassword);
		hasilLogin(statusAkun, parUserName);	
	}
	public User(String username, String password){
		this.username = username;
		this.password = password;
	}
}

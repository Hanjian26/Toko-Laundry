/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laundry;

import java.util.ArrayList;

/**
 *
 * @author Hanjian Listanto
 */
public class Teknis {

    Teknis() {
    }
    static ArrayList<dtPemesanan> PemesanList;

    public static void isi(dtPemesanan data) {
        PemesanList.add(data);
    }

    public static void hapus(int i) {
        PemesanList.remove(i);
    }
}

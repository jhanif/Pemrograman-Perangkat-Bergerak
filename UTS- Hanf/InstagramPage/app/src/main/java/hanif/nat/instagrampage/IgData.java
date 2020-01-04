package hanif.nat.instagrampage;

import java.util.ArrayList;

public class IgData {

        public static String[][] data = new String[][]{
                {"0", "Plesbol Pusat", "Adalah sebuah halaman instagram yang memberikan berita-berita ter-update tentang sepakbola dengan ciri khas plesetannya", "https://i.postimg.cc/gkgQgxmJ/pusat.jpg"},
                {"1", "Garuda Revolution", "Adalah sebuah halaman instagram yang memberikan informasi tentang Sepakbola dalam Negeri", "https://i.postimg.cc/15g7Ks5h/gr.jpg"},
                {"2", "Kepoball", "Adalah sebuah halaman instagram yang memberikan info sepakbola dengan tampilan desain yang menarik", "https://i.postimg.cc/mrT0jJ5Y/kepo.jpg"},
                {"3", "Seputar Bola", "Adalah sebuah halaman instagram yang juga memberikan informasti tentang sepakbola dunia, akun ini juga sudah lama dalam dunia persosmedan lho! ", "https://i.postimg.cc/qMWT01Zn/sepbol.jpg"},
                {"4", "Plesbol Video", "Adalah sebuah halaman instagram yang memberikan video highlights gol dan video lucu tentang sepakbola", "https://i.postimg.cc/YSpywgkY/plesvid.jpg"},
                {"5", "Fakta Bola", "Adalah sebuah halaman instagram yang memberikan informasi tentang fakta sepakbola", "https://i.postimg.cc/XvJmCFh3/fakta.jpg"},
                {"6", "Jokesbola FC", "Adalah sebuah halaman instagram yang memberikan konten lucu dan troll pada sepakbola", "https://i.postimg.cc/T3HQBs7M/jbfc.jpg"},
                {"7", "Roti Tv", "Adalah sebuah halaman instagram yang memberikan video highlights Liga Indonesia", "https://i.postimg.cc/G37BP1HC/roti.jpg" },
        };

        public static ArrayList<Ig> getListData() {
            ArrayList<Ig> list = new ArrayList<>();
            for (String[] IgData : data) {
                Ig Ig = new Ig();
                Ig.setId(Integer.parseInt(IgData[0]));
                Ig.setName(IgData[1]);
                Ig.setDescription(IgData[2]);
                Ig.setPhoto(IgData[3]);

                list.add(Ig);
            }
            return list;
        }
    }

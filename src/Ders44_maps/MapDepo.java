package Ders44_maps;

import java.util.*;

public class MapDepo {

    //  ogrenci map olusturup bize donduren bir method olusturun
    public static Map<Integer, String> ornekMapOlustur() {

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101, "Ali-Can-10-H-MF");
        ogrenciMap.put(102, "Veli-Cem-11-M-Soz");
        ogrenciMap.put(103, "Ali-Cem-11-H-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Ayse-Cem-11-M-TM");
        ogrenciMap.put(106, "Fatma-Han-10-K-Soz");

        return ogrenciMap;
    }

    public static String isimSoyisimDondur(Map<Integer, String> ogrenciMap, int ogrenciKey) {


        String ogrenciValue = ogrenciMap.get(ogrenciKey); //"Ayse-Cem-11-M-TM");

        String[] ValueArr = ogrenciValue.split("-");

        String isimSoyisim = ValueArr[0] + "" + ValueArr[1];

        return isimSoyisim;


    }

    public static Map<Integer, String> ogrenciyeYeniSubeAta(Map<Integer, String> ogrenciMap, int ogrenciKey, String yeniSube) {


        // ogrenci key map'de var mi ? 104

        if (ogrenciMap.containsKey(ogrenciKey)) {
            // istenen Key varsa, update edip yeni map'i dondurecegiz

            String istenenKeyinValuesu = ogrenciMap.get(ogrenciKey); // Ayse-Can-10-H-MF
            String[] istenenKeyvalueArr = istenenKeyinValuesu.split("-"); // [Ayse, Can, 10, H , MF]
            // yeni sube degerini atayalim
            istenenKeyvalueArr[3] = yeniSube; // // [Ayse, Can, 10, K , MF]

            String istenenKeyinYeniValesu = istenenKeyvalueArr[0] + "-" +
                    istenenKeyvalueArr[1] + "-" +
                    istenenKeyvalueArr[2] + "-" +
                    istenenKeyvalueArr[3] + "-" +
                    istenenKeyvalueArr[4];
            ogrenciMap.put(ogrenciKey, istenenKeyinYeniValesu);
        }
        return ogrenciMap;
    }

    public static void subeOgrenciBilgilerinYazdir(Map<Integer, String> ogrenciMap, String subeAdi) {

        Collection<String> valueCollection = ogrenciMap.values();
        System.out.println("Isim  Soyisim  Sinif");
        System.out.println("=====================");

        for (String eachValue : valueCollection
        ) {

            // value yi parcalara ayir
            String[] valueArr = eachValue.split("-");

            // sube ismini kontrol et istenen sube ise isim soyisim ve subesini yazdir
            if (valueArr[3].equals(subeAdi)) {

                System.out.println(valueArr[0] + "  " + valueArr[1] + "  " + valueArr[2]);
            }

        }
    }


    public static List<String> numaradegerineGoreListeOlustur(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        // hem key hemde value lazim oldugundan key seti olusturduk
        // sonra o key uzerinden value yi map den aldik

        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet();

        // dondurecegimiz listeyi olusturalim
        List<String> isimlistesi = new ArrayList<>();

        // key degerlerini tek tek elden gecirip
        //istene aralıkta olanlari bulalim
        String value;
        String[] valueArr;
        String istenenİsim;
        for (Integer eachKey : ogrenciKeySeti) {

            if (basNo <= eachKey && eachKey <= bitNo) {

                // buraya verilen sinir degerlerine uyan eah key'ler gelecek

                // sinira uygun key'in value'sini alalim
                value = ogrenciMap.get(eachKey);

                // value'yu parcalara ayiralim
                valueArr = value.split("-");

                // value arrayinden listeye eklenecek bilgileri alalim
                istenenİsim = valueArr[0] + " " + valueArr[1] + " " + valueArr[4];

                // istenen ismi olusturduk bunu listeye ekleyelim
                isimlistesi.add(istenenİsim);
            }
        }

        return isimlistesi;

    }


    public static void numaraIsimSoyisimyazdir(Map<Integer, String> ogrenciMap) {

        Set<Integer> keySeti = ogrenciMap.keySet();
        String value;
        String[] valueArr;

        for (Integer eachKey : keySeti
        ) {

            value = ogrenciMap.get(eachKey);
            valueArr = value.split("-");

            System.out.println(eachKey + " " + valueArr[0] + " " + valueArr[1]);

        }
    }

    public static Set<String> siraliOgrenciListesiOlustur(Map<Integer, String> ogrenciMap) {

        Set<String> siraliOgrenciListesi = new TreeSet<>();
        // tum elementlerin key ve value'lerine birlikte ihtiyac oldugundan Entry kullanmaliyiz

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // herbir Entry'i elden gecirip bilgileri istedigimiz formatta alalim
        String istenenBilgi;
        String value;
        String[] valueArr;

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            // 101=Ali-Can-10-H-Mf   Entry

            // bolum,sınıfisubeiisim,soyisim ve numaralarini yazdirin

            value = eachEntry.getValue();
            valueArr = value.split("-");

            istenenBilgi = valueArr[4] + ", " + valueArr[2] + ", " + valueArr[3] + ", " +
                    valueArr[0] + ", " + valueArr[1] + ", " + eachEntry.getKey();

            siraliOgrenciListesi.add(istenenBilgi);
            // map de bir degisiklik istenmediginden
            // arrayi yeniden birlestrip entry setvalue() yapmamiza gerek yok

        }


        return siraliOgrenciListesi;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfYap(Map<Integer, String> ogrenciMap) {


        String istenen;
        String value;
        String[] valueArr;
        // soyisimleri buyultmek icin once Entry set alalim
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        //entryset'deki herbir entry'deki value'yi alalim
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            value = eachEntry.getValue();
            // value'yu split yapip arrey'e cevirelim
            valueArr = value.split("-");

            //array deki istedigimiz degisikligi yapalim
            valueArr[1] = valueArr[1].toUpperCase();

            // array'deki yeni bilgileri birlestirip eachentry.setvalue(yeni value)

            eachEntry.setValue(valueArr[0] + ", " +
                    valueArr[1] + ", " +
                    valueArr[2] + ", " +
                    valueArr[3] + ", " +
                    valueArr[4] + ", ");

        }
            return ogrenciMap;
        }

}

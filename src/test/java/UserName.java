import java.util.Scanner;

public class UserName {

            public static void main(String[] args){
            // Scanner Sınıf Tanımlanması:
            Scanner scanner = new Scanner(System.in);
            // Değişken Tanımlaması:
            String userName, userPass, authorityName="Tanımsız";
            int authority;
            // userManager Tanımlaması:
            userManager userManager = new userManager();
            // Yetkileri Ekrana Yazdırma İşlemi:
            System.out.println("--------------------\n-> Yetkiler:");
            for(staffMembers s: staffMembers.values()){
                System.out.println("["+s.getStaffRank()+"] - "+s.name());
            }
            System.out.println("--------------------");
            System.out.print("-> Kullanıcı Adı:");
            userName = scanner.nextLine();
            System.out.print("-> Şifre:");
            userPass = scanner.nextLine();
            System.out.println("--------------------");
            // Kullanıcı Sisteme Tanımlı Admin'mi Kontrolünü Sağlıyoruz.
            if(userName.equals(userManager.userName) && userPass.equals(userManager.userPass)){
                authority = userManager.authority;
            }
            else {
                authority = 4;
            }
            // Verilen Yetki İsmine Erişmek İçin Kuracağımız For Döngüsü:
            for(staffMembers s: staffMembers.values()){
                if(s.getStaffRank()== authority){
                    authorityName = s.name();
                }
            }
            System.out.println("-> Hesabınız Başarılı Bir Şekilde Oluşturuldu.");
            System.out.println("--------------------\n< Kullanıcı Bilgileri >\nKullanıcı Adı: "+userName);
            System.out.println("Şifreniz: "+userPass+"\nYetkiniz: "+authorityName+"\n--------------------");
        }
    }

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите путь до otc v3: "); //без разницы как длл называется, главное путь до нее
        String filePath = input.nextLine();
        //String filePath = "A:/ot3.dll";
        input.close();
        int color = 0; //R
        int color2 = 255; //G
        int color3 = 68; //B
        if (filePath != null) {
            try {
                File file = new File(filePath);
                FileInputStream inputStream = new FileInputStream(file);

                byte[] fileBytes = new byte[(int) file.length()];
                inputStream.read(fileBytes);
                inputStream.close();

                fileBytes[0x077631] = (byte) color;
                fileBytes[0x077631 + 1] = (byte) color2;
                fileBytes[0x077631 + 2] = (byte) color3;

                fileBytes[0x077DF0] = (byte) color;  
                fileBytes[0x077DF0 + 1] = (byte) color2;
                fileBytes[0x077DF0 + 2] = (byte) color3;

                fileBytes[0x077EC1] = (byte) color;  
                fileBytes[0x077EC1 + 1] = (byte) color2;
                fileBytes[0x077EC1 + 2] = (byte) color3;

                fileBytes[0x07A217] = (byte) color;  
                fileBytes[0x07A217 + 1] = (byte) color2;
                fileBytes[0x07A217 + 2] = (byte) color3;

                fileBytes[0x07A9CD] = (byte) color;  
                fileBytes[0x07A9CD + 1] = (byte) color2;
                fileBytes[0x07A9CD + 2] = (byte) color3;

                fileBytes[0x0C3C76] = (byte) color; //watermark *1
                fileBytes[0x0C3C76 + 1] = (byte) color2;
                fileBytes[0x0C3C76 + 2] = (byte) color3;

                fileBytes[0x0C3CA1] = (byte) color;  
                fileBytes[0x0C3CA1 + 1] = (byte) color2;
                fileBytes[0x0C3CA1 + 2] = (byte) color3;

                fileBytes[0x88E880] = (byte) color;  
                fileBytes[0x88E880 + 1] = (byte) color2;
                fileBytes[0x88E880 + 2] = (byte) color3;

                fileBytes[0x88E894] = (byte) color;  
                fileBytes[0x88E894 + 1] = (byte) color2;
                fileBytes[0x88E894 + 2] = (byte) color3;

                fileBytes[0x88E8A8] = (byte) color;  
                fileBytes[0x88E8A8 + 1] = (byte) color2;
                fileBytes[0x88E8A8 + 2] = (byte) color3;

                fileBytes[0x88E8BC] = (byte) color;  
                fileBytes[0x88E8BC + 1] = (byte) color2;
                fileBytes[0x88E8BC + 2] = (byte) color3;

                fileBytes[0x88E8D0] = (byte) color;  
                fileBytes[0x88E8D0 + 1] = (byte) color2;
                fileBytes[0x88E8D0 + 2] = (byte) color3;

                fileBytes[0x88E8E4] = (byte) color;  
                fileBytes[0x88E8E4 + 1] = (byte) color2;
                fileBytes[0x88E8E4 + 2] = (byte) color3;

                fileBytes[0x88E8F8] = (byte) color;  
                fileBytes[0x88E8F8 + 1] = (byte) color2;
                fileBytes[0x88E8F8 + 2] = (byte) color3;

                fileBytes[0x88E90C] = (byte) color;  
                fileBytes[0x88E90C + 1] = (byte) color2;
                fileBytes[0x88E90C + 2] = (byte) color3;

                fileBytes[0x88E920] = (byte) color;  
                fileBytes[0x88E920 + 1] = (byte) color2;
                fileBytes[0x88E920 + 2] = (byte) color3;

                fileBytes[0x88E934] = (byte) color;  
                fileBytes[0x88E934 + 1] = (byte) color2;
                fileBytes[0x88E934 + 2] = (byte) color3;


                fileBytes[0x88E948] = (byte) color;  
                fileBytes[0x88E948 + 1] = (byte) color2;
                fileBytes[0x88E948 + 2] = (byte) color3;


                fileBytes[0x88E95C] = (byte) color;  
                fileBytes[0x88E95C + 1] = (byte) color2;
                fileBytes[0x88E95C + 2] = (byte) color3;


                fileBytes[0x88E970] = (byte) color;  
                fileBytes[0x88E970 + 1] = (byte) color2;
                fileBytes[0x88E970 + 2] = (byte) color3;


                fileBytes[0x88E984] = (byte) color;  
                fileBytes[0x88E984 + 1] = (byte) color2;
                fileBytes[0x88E984 + 2] = (byte) color3;


                fileBytes[0x88E998] = (byte) color;  
                fileBytes[0x88E998 + 1] = (byte) color2;
                fileBytes[0x88E998 + 2] = (byte) color3;


                fileBytes[0x88E9AC] = (byte) color;  
                fileBytes[0x88E9AC + 1] = (byte) color2;
                fileBytes[0x88E9AC + 2] = (byte) color3;


                fileBytes[0x88E9C0] = (byte) color;  
                fileBytes[0x88E9C0 + 1] = (byte) color2;
                fileBytes[0x88E9C0 + 2] = (byte) color3;


                fileBytes[0x88E9D4] = (byte) color;  
                fileBytes[0x88E9D4 + 1] = (byte) color2;
                fileBytes[0x88E9D4 + 2] = (byte) color3;


                fileBytes[0x88E9E8] = (byte) color;  
                fileBytes[0x88E9E8 + 1] = (byte) color2;
                fileBytes[0x88E9E8 + 2] = (byte) color3;


                fileBytes[0x88E9FC] = (byte) color;  
                fileBytes[0x88E9FC + 1] = (byte) color2;
                fileBytes[0x88E9FC + 2] = (byte) color3;


                fileBytes[0x88EA10] = (byte) color;  
                fileBytes[0x88EA10 + 1] = (byte) color2;
                fileBytes[0x88EA10 + 2] = (byte) color3;


                fileBytes[0x88EA24] = (byte) color;  
                fileBytes[0x88EA24 + 1] = (byte) color2;
                fileBytes[0x88EA24 + 2] = (byte) color3;


                fileBytes[0x88EA38] = (byte) color;  
                fileBytes[0x88EA38 + 1] = (byte) color2;
                fileBytes[0x88EA38 + 2] = (byte) color3;


                fileBytes[0x88EA4C] = (byte) color;  
                fileBytes[0x88EA4C + 1] = (byte) color2;
                fileBytes[0x88EA4C + 2] = (byte) color3;


                fileBytes[0x88EA60] = (byte) color;  
                fileBytes[0x88EA60 + 1] = (byte) color2;
                fileBytes[0x88EA60 + 2] = (byte) color3;


                fileBytes[0x88EA74] = (byte) color;  
                fileBytes[0x88EA74 + 1] = (byte) color2;
                fileBytes[0x88EA74 + 2] = (byte) color3;


                fileBytes[0x88EA88] = (byte) color;  
                fileBytes[0x88EA88 + 1] = (byte) color2;
                fileBytes[0x88EA88 + 2] = (byte) color3;


                fileBytes[0x88EA9C] = (byte) color;  
                fileBytes[0x88EA9C + 1] = (byte) color2;
                fileBytes[0x88EA9C + 2] = (byte) color3;


                fileBytes[0x88EAB0] = (byte) color;  
                fileBytes[0x88EAB0 + 1] = (byte) color2;
                fileBytes[0x88EAB0 + 2] = (byte) color3;


                fileBytes[0x88EAC4] = (byte) color;  
                fileBytes[0x88EAC4 + 1] = (byte) color2;
                fileBytes[0x88EAC4 + 2] = (byte) color3;


                fileBytes[0x88EAD8] = (byte) color;  
                fileBytes[0x88EAD8 + 1] = (byte) color2;
                fileBytes[0x88EAD8 + 2] = (byte) color3;


                fileBytes[0x88EAEC] = (byte) color;  
                fileBytes[0x88EAEC + 1] = (byte) color2;
                fileBytes[0x88EAEC + 2] = (byte) color3;


                fileBytes[0x88EB00] = (byte) color;  
                fileBytes[0x88EB00 + 1] = (byte) color2;
                fileBytes[0x88EB00 + 2] = (byte) color3;


                fileBytes[0x88EB14] = (byte) color;  
                fileBytes[0x88EB14 + 1] = (byte) color2;
                fileBytes[0x88EB14 + 2] = (byte) color3;


                fileBytes[0x88EB28] = (byte) color;  
                fileBytes[0x88EB28 + 1] = (byte) color2;
                fileBytes[0x88EB28 + 2] = (byte) color3;


                fileBytes[0x88EB3C] = (byte) color;  
                fileBytes[0x88EB3C + 1] = (byte) color2;
                fileBytes[0x88EB3C + 2] = (byte) color3;


                fileBytes[0x88EB50] = (byte) color;  
                fileBytes[0x88EB50 + 1] = (byte) color2;
                fileBytes[0x88EB50 + 2] = (byte) color3;


                fileBytes[0x88EB64] = (byte) color;  
                fileBytes[0x88EB64 + 1] = (byte) color2;
                fileBytes[0x88EB64 + 2] = (byte) color3;



                fileBytes[0x88EB78] = (byte) color;  
                fileBytes[0x88EB78 + 1] = (byte) color2;
                fileBytes[0x88EB78 + 2] = (byte) color3;


                fileBytes[0x88EB8C] = (byte) color;  
                fileBytes[0x88EB8C + 1] = (byte) color2;
                fileBytes[0x88EB8C + 2] = (byte) color3;


                fileBytes[0x88EBA0] = (byte) color;  
                fileBytes[0x88EBA0 + 1] = (byte) color2;
                fileBytes[0x88EBA0 + 2] = (byte) color3;


                fileBytes[0x88EBB4] = (byte) color;  
                fileBytes[0x88EBB4 + 1] = (byte) color2;
                fileBytes[0x88EBB4 + 2] = (byte) color3;


                fileBytes[0x88EBC8] = (byte) color;  
                fileBytes[0x88EBC8 + 1] = (byte) color2;
                fileBytes[0x88EBC8 + 2] = (byte) color3;


                fileBytes[0x88EBDC] = (byte) color;  
                fileBytes[0x88EBDC + 1] = (byte) color2;
                fileBytes[0x88EBDC + 2] = (byte) color3;


                fileBytes[0x88EBF0] = (byte) color;  
                fileBytes[0x88EBF0 + 1] = (byte) color2;
                fileBytes[0x88EBF0 + 2] = (byte) color3;


                fileBytes[0x88EC04] = (byte) color;  
                fileBytes[0x88EC04 + 1] = (byte) color2;
                fileBytes[0x88EC04 + 2] = (byte) color3;


                fileBytes[0x88EC18] = (byte) color;  
                fileBytes[0x88EC18 + 1] = (byte) color2;
                fileBytes[0x88EC18 + 2] = (byte) color3;


                fileBytes[0x88EC2C] = (byte) color;  
                fileBytes[0x88EC2C + 1] = (byte) color2;
                fileBytes[0x88EC2C + 2] = (byte) color3;


                fileBytes[0x88EC40] = (byte) color;  
                fileBytes[0x88EC40 + 1] = (byte) color2;
                fileBytes[0x88EC40 + 2] = (byte) color3;


                fileBytes[0x88EC54] = (byte) color;  
                fileBytes[0x88EC54 + 1] = (byte) color2;
                fileBytes[0x88EC54 + 2] = (byte) color3;


                fileBytes[0x88EC68] = (byte) color;  
                fileBytes[0x88EC68 + 1] = (byte) color2;
                fileBytes[0x88EC68 + 2] = (byte) color3;

                fileBytes[0x88EC7C] = (byte) color;  
                fileBytes[0x88EC7C + 1] = (byte) color2;
                fileBytes[0x88EC7C + 2] = (byte) color3;

                fileBytes[0x88EC90] = (byte) color;  
                fileBytes[0x88EC90 + 1] = (byte) color2;
                fileBytes[0x88EC90 + 2] = (byte) color3;



                fileBytes[0x88ECA4] = (byte) color;  
                fileBytes[0x88ECA4 + 1] = (byte) color2;
                fileBytes[0x88ECA4 + 2] = (byte) color3;


                fileBytes[0x88ECB8] = (byte) color;  
                fileBytes[0x88ECB8 + 1] = (byte) color2;
                fileBytes[0x88ECB8 + 2] = (byte) color3;


                fileBytes[0x88ECCC] = (byte) color;  
                fileBytes[0x88ECCC + 1] = (byte) color2;
                fileBytes[0x88ECCC + 2] = (byte) color3;


                fileBytes[0x88ECE0] = (byte) color;  
                fileBytes[0x88ECE0 + 1] = (byte) color2;
                fileBytes[0x88ECE0 + 2] = (byte) color3;


                fileBytes[0x88ECF4] = (byte) color;  
                fileBytes[0x88ECF4 + 1] = (byte) color2;
                fileBytes[0x88ECF4 + 2] = (byte) color3;


                fileBytes[0x88ED08] = (byte) color;  
                fileBytes[0x88ED08 + 1] = (byte) color2;
                fileBytes[0x88ED08 + 2] = (byte) color3;


                fileBytes[0x88ED1C] = (byte) color;  
                fileBytes[0x88ED1C + 1] = (byte) color2;
                fileBytes[0x88ED1C + 2] = (byte) color3;


                fileBytes[0x88ED30] = (byte) color;  
                fileBytes[0x88ED30 + 1] = (byte) color2;
                fileBytes[0x88ED30 + 2] = (byte) color3;


                fileBytes[0x88ED44] = (byte) color;  
                fileBytes[0x88ED44 + 1] = (byte) color2;
                fileBytes[0x88ED44 + 2] = (byte) color3;


                fileBytes[0x88ED58] = (byte) color;  
                fileBytes[0x88ED58 + 1] = (byte) color2;
                fileBytes[0x88ED58 + 2] = (byte) color3;


                fileBytes[0x88ED6C] = (byte) color;  
                fileBytes[0x88ED6C + 1] = (byte) color2;
                fileBytes[0x88ED6C + 2] = (byte) color3;


                fileBytes[0x88ED80] = (byte) color;  
                fileBytes[0x88ED80 + 1] = (byte) color2;
                fileBytes[0x88ED80 + 2] = (byte) color3;


                fileBytes[0x88ED94] = (byte) color;  
                fileBytes[0x88ED94 + 1] = (byte) color2;
                fileBytes[0x88ED94 + 2] = (byte) color3;


                fileBytes[0x88EDA8] = (byte) color;  
                fileBytes[0x88EDA8 + 1] = (byte) color2;
                fileBytes[0x88EDA8 + 2] = (byte) color3;


                fileBytes[0x88EDBC] = (byte) color;  
                fileBytes[0x88EDBC + 1] = (byte) color2;
                fileBytes[0x88EDBC + 2] = (byte) color3;


                fileBytes[0x88EDD0] = (byte) color;  
                fileBytes[0x88EDD0 + 1] = (byte) color2;
                fileBytes[0x88EDD0 + 2] = (byte) color3;


                fileBytes[0x88EDE4] = (byte) color;  
                fileBytes[0x88EDE4 + 1] = (byte) color2;
                fileBytes[0x88EDE4 + 2] = (byte) color3;


                fileBytes[0x88EDF8] = (byte) color;  
                fileBytes[0x88EDF8 + 1] = (byte) color2;
                fileBytes[0x88EDF8 + 2] = (byte) color3;


                fileBytes[0x88EE0C] = (byte) color;  
                fileBytes[0x88EE0C + 1] = (byte) color2;
                fileBytes[0x88EE0C + 2] = (byte) color3;


                fileBytes[0x88EE20] = (byte) color;  
                fileBytes[0x88EE20 + 1] = (byte) color2;
                fileBytes[0x88EE20 + 2] = (byte) color3;


                fileBytes[0x88EE34] = (byte) color;  
                fileBytes[0x88EE34 + 1] = (byte) color2;
                fileBytes[0x88EE34 + 2] = (byte) color3;


                fileBytes[0x88EE48] = (byte) color;  
                fileBytes[0x88EE48 + 1] = (byte) color2;
                fileBytes[0x88EE48 + 2] = (byte) color3;


                fileBytes[0x88EE5C] = (byte) color;  
                fileBytes[0x88EE5C + 1] = (byte) color2;
                fileBytes[0x88EE5C + 2] = (byte) color3;


                fileBytes[0x88EE68] = (byte) color;  
                fileBytes[0x88EE68 + 1] = (byte) color2;
                fileBytes[0x88EE68 + 2] = (byte) color3;


                fileBytes[0x88EE7C] = (byte) color;  
                fileBytes[0x88EE7C + 1] = (byte) color2;
                fileBytes[0x88EE7C + 2] = (byte) color3;

                fileBytes[0x88EEA4] = (byte) color;  
                fileBytes[0x88EEA4 + 1] = (byte) color2;
                fileBytes[0x88EEA4 + 2] = (byte) color3;

                fileBytes[0x88EEB8] = (byte) color;  
                fileBytes[0x88EEB8 + 1] = (byte) color2;
                fileBytes[0x88EEB8 + 2] = (byte) color3;

                fileBytes[0x88EECC] = (byte) color;  
                fileBytes[0x88EECC + 1] = (byte) color2;
                fileBytes[0x88EECC + 2] = (byte) color3;

                fileBytes[0x88EEE0] = (byte) color;  
                fileBytes[0x88EEE0 + 1] = (byte) color2;
                fileBytes[0x88EEE0 + 2] = (byte) color3;

                fileBytes[0x88EEF4] = (byte) color;  
                fileBytes[0x88EEF4 + 1] = (byte) color2;
                fileBytes[0x88EEF4 + 2] = (byte) color3;

                fileBytes[0x88EF08] = (byte) color;  
                fileBytes[0x88EF08 + 1] = (byte) color2;
                fileBytes[0x88EF08 + 2] = (byte) color3;

                fileBytes[0x88EF1C] = (byte) color;  
                fileBytes[0x88EF1C + 1] = (byte) color2;
                fileBytes[0x88EF1C + 2] = (byte) color3;

                fileBytes[0x88EF30] = (byte) color;  
                fileBytes[0x88EF30 + 1] = (byte) color2;
                fileBytes[0x88EF30 + 2] = (byte) color3;

                fileBytes[0x88EF44] = (byte) color;  
                fileBytes[0x88EF44 + 1] = (byte) color2;
                fileBytes[0x88EF44 + 2] = (byte) color3;

                fileBytes[0x88EF58] = (byte) color;  
                fileBytes[0x88EF58 + 1] = (byte) color2;
                fileBytes[0x88EF58 + 2] = (byte) color3;

                fileBytes[0x88EF6C] = (byte) color;  
                fileBytes[0x88EF6C + 1] = (byte) color2;
                fileBytes[0x88EF6C + 2] = (byte) color3;

                fileBytes[0x88EF80] = (byte) color;  
                fileBytes[0x88EF80 + 1] = (byte) color2;
                fileBytes[0x88EF80 + 2] = (byte) color3;

                fileBytes[0x88EF94] = (byte) color;  
                fileBytes[0x88EF94 + 1] = (byte) color2;
                fileBytes[0x88EF94 + 2] = (byte) color3;

                fileBytes[0x88EFA8] = (byte) color;  
                fileBytes[0x88EFA8 + 1] = (byte) color2;
                fileBytes[0x88EFA8 + 2] = (byte) color3;

                fileBytes[0x88EFBC] = (byte) color;  
                fileBytes[0x88EFBC + 1] = (byte) color2;
                fileBytes[0x88EFBC + 2] = (byte) color3;

                fileBytes[0x88EFD0] = (byte) color;  
                fileBytes[0x88EFD0 + 1] = (byte) color2;
                fileBytes[0x88EFD0 + 2] = (byte) color3;

                fileBytes[0x88EFE4] = (byte) color;  
                fileBytes[0x88EFE4 + 1] = (byte) color2;
                fileBytes[0x88EFE4 + 2] = (byte) color3;

                fileBytes[0x88EFF8] = (byte) color;  
                fileBytes[0x88EFF8 + 1] = (byte) color2;
                fileBytes[0x88EFF8 + 2] = (byte) color3;

                fileBytes[0x88F00C] = (byte) color;  
                fileBytes[0x88F00C + 1] = (byte) color2;
                fileBytes[0x88F00C + 2] = (byte) color3;

                fileBytes[0x88F020] = (byte) color;  
                fileBytes[0x88F020 + 1] = (byte) color2;
                fileBytes[0x88F020 + 2] = (byte) color3;

                fileBytes[0x88F034] = (byte) color;  
                fileBytes[0x88F034 + 1] = (byte) color2;
                fileBytes[0x88F034 + 2] = (byte) color3;

                fileBytes[0x88F048] = (byte) color;  
                fileBytes[0x88F048 + 1] = (byte) color2;
                fileBytes[0x88F048 + 2] = (byte) color3;

                fileBytes[0x88F05C] = (byte) color;  
                fileBytes[0x88F05C + 1] = (byte) color2;
                fileBytes[0x88F05C + 2] = (byte) color3;

                fileBytes[0x88F070] = (byte) color;  
                fileBytes[0x88F070 + 1] = (byte) color2;
                fileBytes[0x88F070 + 2] = (byte) color3;

                fileBytes[0x88F084] = (byte) color;  
                fileBytes[0x88F084 + 1] = (byte) color2;
                fileBytes[0x88F084 + 2] = (byte) color3;

                fileBytes[0x88F098] = (byte) color;  
                fileBytes[0x88F098 + 1] = (byte) color2;
                fileBytes[0x88F098 + 2] = (byte) color3;

                fileBytes[0x88F0AC] = (byte) color;  
                fileBytes[0x88F0AC + 1] = (byte) color2;
                fileBytes[0x88F0AC + 2] = (byte) color3;

                fileBytes[0x88F0C0] = (byte) color;  
                fileBytes[0x88F0C0 + 1] = (byte) color2;
                fileBytes[0x88F0C0 + 2] = (byte) color3;

                fileBytes[0x88F0D4] = (byte) color;  
                fileBytes[0x88F0D4 + 1] = (byte) color2;
                fileBytes[0x88F0D4 + 2] = (byte) color3;

                fileBytes[0x88F0E8] = (byte) color;  
                fileBytes[0x88F0E8 + 1] = (byte) color2;
                fileBytes[0x88F0E8 + 2] = (byte) color3;

                fileBytes[0x88F0FC] = (byte) color;  
                fileBytes[0x88F0FC + 1] = (byte) color2;
                fileBytes[0x88F0FC + 2] = (byte) color3;

                fileBytes[0x88F110] = (byte) color;  
                fileBytes[0x88F110 + 1] = (byte) color2;
                fileBytes[0x88F110 + 2] = (byte) color3;

                fileBytes[0x88F124] = (byte) color;  
                fileBytes[0x88F124 + 1] = (byte) color2;
                fileBytes[0x88F124 + 2] = (byte) color3;

                fileBytes[0x88F138] = (byte) color;  
                fileBytes[0x88F138 + 1] = (byte) color2;
                fileBytes[0x88F138 + 2] = (byte) color3;

                fileBytes[0x88F14C] = (byte) color;  
                fileBytes[0x88F14C + 1] = (byte) color2;
                fileBytes[0x88F14C + 2] = (byte) color3;

                fileBytes[0x88F160] = (byte) color;  
                fileBytes[0x88F160 + 1] = (byte) color2;
                fileBytes[0x88F160 + 2] = (byte) color3;

                fileBytes[0x88F174] = (byte) color;  
                fileBytes[0x88F174 + 1] = (byte) color2;
                fileBytes[0x88F174 + 2] = (byte) color3;

                fileBytes[0x88F188] = (byte) color;  
                fileBytes[0x88F188 + 1] = (byte) color2;
                fileBytes[0x88F188 + 2] = (byte) color3;

                fileBytes[0x88F19C] = (byte) color;  
                fileBytes[0x88F19C + 1] = (byte) color2;
                fileBytes[0x88F19C + 2] = (byte) color3;

                fileBytes[0x88F1B0] = (byte) color;  
                fileBytes[0x88F1B0 + 1] = (byte) color2;
                fileBytes[0x88F1B0 + 2] = (byte) color3;

                fileBytes[0x88F1C4] = (byte) color;  
                fileBytes[0x88F1C4 + 1] = (byte) color2;
                fileBytes[0x88F1C4 + 2] = (byte) color3;

                fileBytes[0x88F1D8] = (byte) color;  
                fileBytes[0x88F1D8 + 1] = (byte) color2;
                fileBytes[0x88F1D8 + 2] = (byte) color3;

                fileBytes[0x88F1EC] = (byte) color;  
                fileBytes[0x88F1EC + 1] = (byte) color2;
                fileBytes[0x88F1EC + 2] = (byte) color3;

                fileBytes[0x88F200] = (byte) color;  
                fileBytes[0x88F200 + 1] = (byte) color2;
                fileBytes[0x88F200 + 2] = (byte) color3;

                fileBytes[0x88F214] = (byte) color;  
                fileBytes[0x88F214 + 1] = (byte) color2;
                fileBytes[0x88F214 + 2] = (byte) color3;

                fileBytes[0x88F228] = (byte) color;  
                fileBytes[0x88F228 + 1] = (byte) color2;
                fileBytes[0x88F228 + 2] = (byte) color3;

                fileBytes[0x88F23C] = (byte) color;  
                fileBytes[0x88F23C + 1] = (byte) color2;
                fileBytes[0x88F23C + 2] = (byte) color3;

                fileBytes[0x88F250] = (byte) color;  
                fileBytes[0x88F250 + 1] = (byte) color2;
                fileBytes[0x88F250 + 2] = (byte) color3;

                fileBytes[0x88F264] = (byte) color;  
                fileBytes[0x88F264 + 1] = (byte) color2;
                fileBytes[0x88F264 + 2] = (byte) color3;

                fileBytes[0x88F278] = (byte) color;  
                fileBytes[0x88F278 + 1] = (byte) color2;
                fileBytes[0x88F278 + 2] = (byte) color3;

                fileBytes[0x88F28C] = (byte) color;  
                fileBytes[0x88F28C + 1] = (byte) color2;
                fileBytes[0x88F28C + 2] = (byte) color3;

                fileBytes[0x88F2A0] = (byte) color;  
                fileBytes[0x88F2A0 + 1] = (byte) color2;
                fileBytes[0x88F2A0 + 2] = (byte) color3;

                fileBytes[0x88F2B4] = (byte) color;  
                fileBytes[0x88F2B4 + 1] = (byte) color2;
                fileBytes[0x88F2B4 + 2] = (byte) color3;

                fileBytes[0x88F2C8] = (byte) color;  
                fileBytes[0x88F2C8 + 1] = (byte) color2;
                fileBytes[0x88F2C8 + 2] = (byte) color3;

                fileBytes[0x88F2DC] = (byte) color;  
                fileBytes[0x88F2DC + 1] = (byte) color2;
                fileBytes[0x88F2DC + 2] = (byte) color3;

                fileBytes[0x88F2F0] = (byte) color;  
                fileBytes[0x88F2F0 + 1] = (byte) color2;
                fileBytes[0x88F2F0 + 2] = (byte) color3;

                fileBytes[0x88F304] = (byte) color;  
                fileBytes[0x88F304 + 1] = (byte) color2;
                fileBytes[0x88F304 + 2] = (byte) color3;

                fileBytes[0x88F318] = (byte) color;  
                fileBytes[0x88F318 + 1] = (byte) color2;
                fileBytes[0x88F318 + 2] = (byte) color3;







                FileOutputStream outputStream = new FileOutputStream(file);

                outputStream.write(fileBytes);
                outputStream.close();
                System.out.println("Файл успешно изменен.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Введен неверный путь до файла!");
        }
    }
}
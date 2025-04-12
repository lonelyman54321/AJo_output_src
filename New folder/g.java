/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 */
import android.os.Build;
import kotlin.text.StringsKt;
import kotlin.text.b;

public final class g {
    public static final boolean a;

    static {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        boolean bl2 = false;
        if (n3 != n4) {
            String string2;
            n4 = 27;
            if (n3 == n4 && (string2 = Build.DEVICE) != null) {
                String string3 = "SGINO6";
                String string4 = "st18c10bnn";
                String string5 = "mcv1s";
                String string6 = "mcv3";
                String string7 = "mcv5a";
                String string8 = "mcv7a";
                String string9 = "A30ATMO";
                String string10 = "A70AXLTMO";
                String string11 = "A3A_8_4G_TMO";
                String string12 = "Edison_CKT";
                String string13 = "EDISON_TF";
                String string14 = "FERMI_TF";
                String string15 = "U50A_ATT";
                String string16 = "U50A_PLUS_ATT";
                String string17 = "U50A_PLUS_TF";
                String string18 = "U50APLUSTMO";
                String string19 = "U5A_PLUS_4G";
                String string20 = "RCT6513W87DK5e";
                String string21 = "RCT6873W42BMF9A";
                String string22 = "RCT6A03W13";
                String string23 = "RCT6B03W12";
                String string24 = "RCT6B03W13";
                String string25 = "RCT6T06E13";
                String string26 = "A3_Pro";
                String string27 = "One";
                String string28 = "One_Max";
                String string29 = "One_Pro";
                String string30 = "Z2";
                String string31 = "Z2_PRO";
                String string32 = "Armor_3";
                String string33 = "Armor_6";
                String string34 = "Blackview";
                String string35 = "BV9500";
                String string36 = "BV9500Pro";
                String string37 = "A6L-C";
                String string38 = "N5002LA";
                String string39 = "N5501LA";
                String string40 = "Power_2_Pro";
                String string41 = "Power_5";
                String string42 = "Z9";
                String string43 = "V0310WW";
                String string44 = "V0330WW";
                String string45 = "A3";
                String string46 = "ASUS_X018_4";
                String string47 = "C210AE";
                String string48 = "fireball";
                String string49 = "ILA_X1";
                String string50 = "Infinix-X605_sprout";
                String string51 = "j7maxlte";
                String string52 = "KING_KONG_3";
                String string53 = "M10500";
                String string54 = "S70";
                String string55 = "S80Lite";
                String string56 = "TECNO-CA8";
                String string57 = "SHIFT6m";
                Object[] objectArray = new String[]{string5, string6, string7, string8, string9, string10, string11, string12, string13, string14, string15, string16, string17, string18, string19, string20, string21, string22, string23, string24, string25, string26, string27, string28, string29, string30, string31, string32, string33, string34, string35, string36, string37, string38, string39, string40, string41, string42, string43, string44, string45, string46, string47, string48, string49, string50, string51, string52, string53, string54, string55, string3, string4, string56, string57};
                bl2 = tp_2.w(objectArray, string2);
            }
        } else {
            String string58 = Build.MODEL;
            if (string58 != null) {
                Object[] objectArray;
                n3 = (int)(b.s(string58 = StringsKt.U(string58, "SAMSUNG-"), (String)(objectArray = "SM-"), false) ? 1 : 0);
                if (n3 != 0) {
                    bl2 = true;
                } else {
                    string58 = Build.DEVICE;
                    if (string58 != null) {
                        String string59 = "CatS41";
                        String string60 = "Hi9Pro";
                        String string61 = "nora";
                        String string62 = "nora_8917";
                        String string63 = "nora_8917_n";
                        String string64 = "james";
                        String string65 = "rjames_f";
                        String string66 = "rjames_go";
                        String string67 = "pettyl";
                        String string68 = "hannah";
                        String string69 = "ahannah";
                        String string70 = "rhannah";
                        String string71 = "ali";
                        String string72 = "ali_n";
                        String string73 = "aljeter";
                        String string74 = "aljeter_n";
                        String string75 = "jeter";
                        String string76 = "evert";
                        String string77 = "evert_n";
                        String string78 = "evert_nt";
                        String string79 = "G3112";
                        String string80 = "G3116";
                        String string81 = "G3121";
                        String string82 = "G3123";
                        String string83 = "G3125";
                        String string84 = "G3412";
                        String string85 = "G3416";
                        String string86 = "G3421";
                        String string87 = "G3423";
                        String string88 = "G3426";
                        String string89 = "G3212";
                        String string90 = "G3221";
                        String string91 = "G3223";
                        String string92 = "G3226";
                        String string93 = "BV6800Pro";
                        String string94 = "manning";
                        String string95 = "N5702L";
                        objectArray = new String[]{string61, string62, string63, string64, string65, string66, string67, string68, string69, string70, string71, string72, string73, string74, string75, string76, string77, string78, string79, string80, string81, string82, string83, string84, string85, string86, string87, string88, string89, string90, string91, string92, string93, string59, string60, string94, string95};
                        bl2 = tp_2.w(objectArray, string58);
                    }
                }
            }
        }
        a = bl2;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Log;
import com.ril.ajio.R$drawable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/*
 * Renamed from cF
 */
public final class cf_2
implements Ez0 {
    public static int c(String string2) {
        int n3 = TextUtils.isEmpty((CharSequence)string2);
        if (n3 != 0) {
            return R$drawable.ic_search_transparent;
        }
        String string3 = "";
        string2 = string2.replaceAll("_", string3);
        String string4 = " ";
        string2 = string2.replaceAll(string4, string3).toUpperCase();
        string2.getClass();
        n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 2112518760: {
                string3 = "SHIPMENTDELAYED";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 37;
                break;
            }
            case 1982485311: {
                string3 = "CONFIRMED";
                boolean bl3 = string2.equals(string3);
                if (!bl3) break;
                n3 = 36;
                break;
            }
            case 1913739557: {
                string3 = "REFUNDREQUESTDECLINED";
                boolean bl4 = string2.equals(string3);
                if (!bl4) break;
                n3 = 35;
                break;
            }
            case 1746537160: {
                string3 = "CREATED";
                boolean bl5 = string2.equals(string3);
                if (!bl5) break;
                n3 = 34;
                break;
            }
            case 1688593551: {
                string3 = "PENDINGPAYMENT";
                boolean bl6 = string2.equals(string3);
                if (!bl6) break;
                n3 = 33;
                break;
            }
            case 1645610927: {
                string3 = "OUTFORDELIVERY";
                boolean bl7 = string2.equals(string3);
                if (!bl7) break;
                n3 = 32;
                break;
            }
            case 1546345985: {
                string3 = "RETURNCANCELLED";
                boolean bl8 = string2.equals(string3);
                if (!bl8) break;
                n3 = 31;
                break;
            }
            case 1196450899: {
                string3 = "REFUNDINITIATED";
                boolean bl9 = string2.equals(string3);
                if (!bl9) break;
                n3 = 30;
                break;
            }
            case 1112685009: {
                string3 = "PARTIALRETURN";
                boolean bl10 = string2.equals(string3);
                if (!bl10) break;
                n3 = 29;
                break;
            }
            case 1002834649: {
                string3 = "PAYMENTUNSUCCESSFUL";
                boolean bl11 = string2.equals(string3);
                if (!bl11) break;
                n3 = 28;
                break;
            }
            case 924917445: {
                string3 = "PARTIALLYSHIPPED";
                boolean bl12 = string2.equals(string3);
                if (!bl12) break;
                n3 = 27;
                break;
            }
            case 820770203: {
                string3 = "RETURNINITIATED";
                boolean bl13 = string2.equals(string3);
                if (!bl13) break;
                n3 = 26;
                break;
            }
            case 725274640: {
                string3 = "SHIPPMENTDELAYED";
                boolean bl14 = string2.equals(string3);
                if (!bl14) break;
                n3 = 25;
                break;
            }
            case 692648796: {
                string3 = "DELIVERYRESHCEDULED";
                boolean bl15 = string2.equals(string3);
                if (!bl15) break;
                n3 = 24;
                break;
            }
            case 591977807: {
                string3 = "PARTIALRETURNREJECTED";
                boolean bl16 = string2.equals(string3);
                if (!bl16) break;
                n3 = 23;
                break;
            }
            case 475639247: {
                string3 = "RETURNED";
                boolean bl17 = string2.equals(string3);
                if (!bl17) break;
                n3 = 22;
                break;
            }
            case 373778405: {
                string3 = "PARTIALLYREFUNDINITIATED";
                boolean bl18 = string2.equals(string3);
                if (!bl18) break;
                n3 = 21;
                break;
            }
            case 257295790: {
                string3 = "RETURNREJECTED";
                boolean bl19 = string2.equals(string3);
                if (!bl19) break;
                n3 = 20;
                break;
            }
            case -61038444: {
                string3 = "SHIPMENTINTRANSIT";
                boolean bl20 = string2.equals(string3);
                if (!bl20) break;
                n3 = 19;
                break;
            }
            case -312615752: {
                string3 = "PAYMENTINPROGRESS";
                boolean bl21 = string2.equals(string3);
                if (!bl21) break;
                n3 = 18;
                break;
            }
            case -656807150: {
                string3 = "CANCELLATION_REQUESTED";
                boolean bl22 = string2.equals(string3);
                if (!bl22) break;
                n3 = 17;
                break;
            }
            case -891628795: {
                string3 = "PARTIALLYRETURNACCEPTED";
                boolean bl23 = string2.equals(string3);
                if (!bl23) break;
                n3 = 16;
                break;
            }
            case -912403901: {
                string3 = "PARTIALLYCANCELLED";
                boolean bl24 = string2.equals(string3);
                if (!bl24) break;
                n3 = 15;
                break;
            }
            case -926562734: {
                string3 = "INPROGRESS";
                boolean bl25 = string2.equals(string3);
                if (!bl25) break;
                n3 = 14;
                break;
            }
            case -1031784143: {
                string3 = "CANCELLED";
                boolean bl26 = string2.equals(string3);
                if (!bl26) break;
                n3 = 13;
                break;
            }
            case -1161358223: {
                string3 = "CANCELLATION REQUESTED";
                boolean bl27 = string2.equals(string3);
                if (!bl27) break;
                n3 = 12;
                break;
            }
            case -1183077763: {
                string3 = "PARTIALLYRETURNED";
                boolean bl28 = string2.equals(string3);
                if (!bl28) break;
                n3 = 11;
                break;
            }
            case -1228666671: {
                string3 = "PAYMENTPENDING";
                boolean bl29 = string2.equals(string3);
                if (!bl29) break;
                n3 = 10;
                break;
            }
            case -1280732969: {
                string3 = "RETURNACCEPTED";
                boolean bl30 = string2.equals(string3);
                if (!bl30) break;
                n3 = 9;
                break;
            }
            case -1318021480: {
                string3 = "DELIVERYATTEMPTED";
                boolean bl31 = string2.equals(string3);
                if (!bl31) break;
                n3 = 8;
                break;
            }
            case -1515427533: {
                string3 = "SHIPPED";
                boolean bl32 = string2.equals(string3);
                if (!bl32) break;
                n3 = 7;
                break;
            }
            case -1522565597: {
                string3 = "EXCHANGE";
                boolean bl33 = string2.equals(string3);
                if (!bl33) break;
                n3 = 6;
                break;
            }
            case -1586720602: {
                string3 = "PARTIALLYPACKED";
                boolean bl34 = string2.equals(string3);
                if (!bl34) break;
                n3 = 5;
                break;
            }
            case -1608310182: {
                string3 = "RETURNINPROCESS";
                boolean bl35 = string2.equals(string3);
                if (!bl35) break;
                n3 = 4;
                break;
            }
            case -1631319690: {
                string3 = "PARTIALLYDELIVERED";
                boolean bl36 = string2.equals(string3);
                if (!bl36) break;
                n3 = 3;
                break;
            }
            case -1688989158: {
                string3 = "PARTIALRETURNINITIATED";
                boolean bl37 = string2.equals(string3);
                if (!bl37) break;
                n3 = 2;
                break;
            }
            case -1750699932: {
                string3 = "DELIVERED";
                boolean bl38 = string2.equals(string3);
                if (!bl38) break;
                n3 = 1;
                break;
            }
            case -1942536072: {
                string3 = "PACKED";
                boolean bl39 = string2.equals(string3);
                if (!bl39) break;
                n3 = 0;
                string4 = null;
            }
        }
        switch (n3) {
            default: {
                return R$drawable.ic_search_transparent;
            }
            case 14: 
            case 34: 
            case 36: {
                return R$drawable.ic_order_confirmed;
            }
            case 12: 
            case 13: 
            case 15: 
            case 17: {
                return R$drawable.ic_order_cancel;
            }
            case 10: 
            case 18: 
            case 28: 
            case 33: {
                return R$drawable.ic_order_payment_unsuccessful;
            }
            case 8: 
            case 24: 
            case 32: {
                return R$drawable.ic_order_out_for_delivery;
            }
            case 7: 
            case 19: 
            case 25: 
            case 27: 
            case 37: {
                return R$drawable.ic_order_shipped;
            }
            case 6: 
            case 21: 
            case 30: 
            case 35: {
                return R$drawable.ic_order_refund;
            }
            case 2: 
            case 4: 
            case 9: 
            case 11: 
            case 16: 
            case 20: 
            case 22: 
            case 23: 
            case 26: 
            case 29: 
            case 31: {
                return R$drawable.ic_order_return;
            }
            case 1: 
            case 3: {
                return R$drawable.ic_order_delivered;
            }
            case 0: 
            case 5: 
        }
        return R$drawable.ic_order_packed;
    }

    public static final Rect d(Vi1 vi1) {
        int n3 = vi1.a;
        int n4 = vi1.b;
        int n7 = vi1.c;
        int n8 = vi1.d;
        Rect rect = new Rect(n3, n4, n7, n8);
        return rect;
    }

    public static final Rect e(aG2 aG22) {
        int n3 = (int)aG22.a;
        int n4 = (int)aG22.b;
        int n7 = (int)aG22.c;
        int n8 = (int)aG22.d;
        Rect rect = new Rect(n3, n4, n7, n8);
        return rect;
    }

    public static final RectF f(aG2 aG22) {
        float f5 = aG22.a;
        float f6 = aG22.b;
        float f7 = aG22.c;
        float f8 = aG22.d;
        RectF rectF = new RectF(f5, f6, f7, f8);
        return rectF;
    }

    public static final aG2 g(RectF rectF) {
        float f5 = rectF.left;
        float f6 = rectF.top;
        float f7 = rectF.right;
        float f8 = rectF.bottom;
        aG2 aG22 = new aG2(f5, f6, f7, f8);
        return aG22;
    }

    public boolean b(Object object, File file, Z92 z92) {
        boolean bl2;
        object = (ByteBuffer)object;
        try {
            hf_0.d((ByteBuffer)object, file);
            bl2 = true;
        }
        catch (IOException iOException) {
            int n3 = 3;
            Log.isLoggable((String)"ByteBufferEncoder", (int)n3);
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}


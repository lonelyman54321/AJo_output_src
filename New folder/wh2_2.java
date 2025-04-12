/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 */
import android.text.TextUtils;
import android.util.Base64;
import com.ril.ajio.services.data.Order.ShipmentInvoice;
import java.io.File;
import java.io.FileOutputStream;

/*
 * Renamed from wh2
 */
public final class wh2_2 {
    public final ShipmentInvoice a;
    public final f82_0 b;
    public final th2_2 c;

    public wh2_2(ShipmentInvoice shipmentInvoice, f82_0 f82_02) {
        th2_2 th2_22;
        this.c = th2_22 = new th2_2(this);
        this.a = shipmentInvoice;
        this.b = f82_02;
    }

    public final String a() {
        boolean bl2;
        Object object = this.a;
        Object object2 = ((ShipmentInvoice)object).getInvoicePdfContent();
        Object object3 = ((ShipmentInvoice)object).getOrderId();
        ((ShipmentInvoice)object).getShipmentCode();
        object = km0_2.a;
        long l2 = System.currentTimeMillis();
        boolean bl3 = TextUtils.isEmpty((CharSequence)object3);
        String string2 = "AJIO_";
        if (!bl3) {
            string2 = kp1_0.c(string2, (String)object3);
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(l2);
        ((StringBuilder)object).append(".pdf");
        object = ((StringBuilder)object).toString();
        String string3 = km0_2.a;
        object3 = new File(string3, (String)object);
        boolean bl4 = ((File)object3).exists();
        if (bl4 && (bl2 = ((File)(object3 = new File(string3, (String)object))).exists())) {
            ((File)object3).delete();
        }
        object3 = new File(string3, (String)object);
        object = new FileOutputStream((File)object3);
        object2 = Base64.decode((String)object2, (int)2);
        ((FileOutputStream)object).write((byte[])object2);
        ((FileOutputStream)object).close();
        return ((File)object3).getAbsolutePath();
    }
}


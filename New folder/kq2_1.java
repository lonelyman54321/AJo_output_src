/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.view.WindowManager
 */
import android.graphics.Point;
import android.view.WindowManager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/*
 * Renamed from kq2
 */
public final class kq2_1 {
    public static int a;

    public static String a(float f5) {
        Object object;
        block13: {
            Object object2;
            CharSequence charSequence;
            block12: {
                String string2 = "";
                charSequence = "0";
                object2 = ".00";
                String string3 = "#,###,###.##";
                try {
                    object = new DecimalFormat(string3);
                }
                catch (Exception exception) {
                    charSequence = new StringBuilder(string2);
                    ((StringBuilder)charSequence).append(f5);
                    return ((StringBuilder)charSequence).toString();
                }
                double d2 = f5;
                object = ((NumberFormat)object).format(d2);
                if (object == null) {
                    return string2;
                }
                string3 = ".";
                boolean n3 = ((String)object).contains(string3);
                if (n3) break block12;
                object = ((String)object).concat((String)object2);
            }
            object2 = "\\.";
            object2 = ((String)object).split((String)object2);
            int n3 = ((String[])object2).length;
            int n4 = 1;
            if (n3 <= n4) break block13;
            object2 = object2[n4];
            int n7 = ((String)object2).length();
            if (n7 != n4) break block13;
            object = ((String)object).concat((String)charSequence);
        }
        return object;
    }

    public static String b(float f5) {
        DecimalFormat decimalFormat = new DecimalFormat("#,###,###.##");
        double d2 = f5;
        return decimalFormat.format(d2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int c() {
        Class<kq2_1> clazz = kq2_1.class;
        synchronized (clazz) {
            try {
                int n3 = a;
                if (n3 != 0) return a;
                Object object = AJIOApplication.Companion;
                object.getClass();
                object = AJIOApplication$a.a();
                String string2 = "window";
                object = object.getSystemService(string2);
                object = (WindowManager)object;
                if (object == null) return a;
                object = object.getDefaultDisplay();
                string2 = new Point();
                object.getSize((Point)string2);
                a = n3 = ((Point)string2).x;
                return a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static void d(Toolbar object, AppCompatActivity appCompatActivity) {
        if (appCompatActivity != null) {
            appCompatActivity.setSupportActionBar((Toolbar)object);
            object = appCompatActivity.getSupportActionBar();
            if (object != null) {
                ((ActionBar)object).q();
                ((ActionBar)object).r();
                boolean bl2 = true;
                ((ActionBar)object).n(bl2);
                ((ActionBar)object).p();
            }
        }
    }
}


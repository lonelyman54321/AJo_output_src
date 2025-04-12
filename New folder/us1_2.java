/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 */
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.NavImpl;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from uS1
 */
public final class us1_2
implements AdapterView.OnItemClickListener {
    public List a;
    public final ms1_2 b;
    public Long c;

    public us1_2(ms1_2 ms1_22, ArrayList arrayList) {
        Long l2;
        this.c = l2 = Long.valueOf(0L);
        this.b = ms1_22;
        this.a = arrayList;
    }

    public final void onItemClick(AdapterView object, View object2, int n3, long l2) {
        Object object3;
        int n4;
        object = this.a;
        if (object != null && n3 < (n4 = object.size()) && (object = (NavImpl)this.a.get(n3)) != null && (object3 = TextUtils.isEmpty((CharSequence)(object2 = object.getThisName()))) == 0) {
            object2 = object.getThisName();
            object3 = ((String)object2).equalsIgnoreCase("Address Book");
            ms1_2 ms1_22 = this.b;
            if (object3 != 0) {
                ms1_22.w2();
            } else {
                String string2;
                object2 = object.getThisName();
                object3 = ((String)object2).equalsIgnoreCase(string2 = "Orders");
                if (object3 != 0) {
                    ms1_22.K8();
                } else {
                    object2 = object.getThisName();
                    object3 = ((String)object2).equalsIgnoreCase(string2 = "Game Zone");
                    if (object3 != 0) {
                        ms1_22.getClass();
                    } else {
                        int n7;
                        object2 = object.getThisName();
                        object3 = ((String)object2).equalsIgnoreCase(string2 = hv3_0.K(n7 = R$string.customer_care));
                        if (object3 != 0) {
                            ms1_22.e2();
                            return;
                        }
                        object2 = object.getThisName();
                        object3 = ((String)object2).equalsIgnoreCase(string2 = "Sign Out");
                        if (object3 != 0) {
                            ms1_22.y6();
                        } else {
                            object2 = object.getThisName();
                            object3 = ((String)object2).equalsIgnoreCase(string2 = "Ajio Wallet");
                            if (object3 != 0) {
                                ms1_22.B7();
                            }
                        }
                    }
                }
            }
            object3 = object instanceof LinkDetail;
            if (object3 != 0) {
                object = (LinkDetail)object;
                ms1_22.i6((LinkDetail)object);
            } else {
                object3 = object instanceof v92_0;
                if (object3 != 0) {
                    l2 = SystemClock.elapsedRealtime();
                    object2 = this.c;
                    long l3 = (Long)object2;
                    long l4 = (l2 -= l3) - (l3 = (long)1000);
                    object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object3 >= 0) {
                        l2 = SystemClock.elapsedRealtime();
                        this.c = object2 = Long.valueOf(l2);
                        object = (v92_0)object;
                        ms1_22.f1((v92_0)object);
                    }
                }
            }
        }
    }
}


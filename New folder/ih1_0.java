/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ClipDescription
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.View
 */
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from Ih1
 */
public final class ih1_0
implements bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ ih1_0(Object object) {
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Lh1 object, int n3, Bundle bundle) {
        M60$b m60$b;
        Object object2;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 25;
        boolean bl2 = false;
        int n8 = 1;
        if (n4 >= n7 && (n3 &= n8) != 0) {
            Bundle bundle2;
            try {
                object2 = ((Lh1)object).a;
                object2.c();
            }
            catch (Exception exception) {
                return bl2;
            }
            object2 = (Parcelable)((Lh1)object).a.a();
            bundle = bundle == null ? new Bundle() : (bundle2 = new Bundle(bundle));
            String string2 = "androidx.core.view.extra.INPUT_CONTENT_INFO";
            bundle.putParcelable(string2, (Parcelable)object2);
        }
        ClipDescription clipDescription = ((Lh1)object).a.getDescription();
        object = ((Lh1)object).a;
        Uri uri = object.b();
        ClipData.Item item = new ClipData.Item(uri);
        object2 = new ClipData(clipDescription, item);
        n7 = 31;
        int n10 = 2;
        if (n4 >= n7) {
            m60$b = new M60$a((ClipData)object2, n10);
        } else {
            m60$b = new Object();
            ((M60$c)m60$b).a = object2;
            ((M60$c)m60$b).b = n10;
        }
        object = object.d();
        m60$b.a((Uri)object);
        m60$b.setExtras(bundle);
        object = m60$b.build();
        object2 = (View)this.a;
        object = ViewCompat.o((View)object2, (M60)object);
        if (object != null) return bl2;
        return true;
    }

    public Object apply(Object object) {
        return (DataCallback)oj_0.a((Function1)this.a, "$tmp0", object, "p0", object);
    }
}


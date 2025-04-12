/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$o;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from TT2
 */
public final class tt2_2 {
    public static final TT2$a Companion;
    public final HashMap a;
    public final LinkedHashSet b;

    static {
        TT2$a tT2$a;
        Companion = tT2$a = new Object();
    }

    public tt2_2() {
        this(null);
    }

    public tt2_2(Bundle bundle) {
        Iterator iterator = new Iterator();
        this.a = iterator;
        this.b = iterator;
        if (bundle != null && (bundle = bundle.getBundle((String)((Object)(iterator = "scroll_state_bundle")))) != null) {
            boolean bl2;
            iterator = bundle.keySet();
            String string2 = "keySet(...)";
            Intrinsics.checkNotNullExpressionValue(iterator, string2);
            iterator = ((Iterable)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                Parcelable parcelable;
                string2 = (String)iterator.next();
                Intrinsics.checkNotNull(string2);
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 33;
                if (n3 >= n4) {
                    parcelable = (Parcelable)VX1.a(bundle, string2);
                } else {
                    parcelable = bundle.getParcelable(string2);
                    n4 = parcelable instanceof Parcelable;
                    if (n4 == 0) {
                        n3 = 0;
                        parcelable = null;
                    }
                }
                if (parcelable == null) continue;
                HashMap hashMap = this.a;
                hashMap.put(string2, parcelable);
            }
        }
    }

    public final void a(RecyclerView object, TT2$b object2) {
        Intrinsics.checkNotNullParameter(object, "recyclerView");
        String string2 = "scrollKeyProvider";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = object2.k();
        if (object2 == null) {
            return;
        }
        if ((object = ((RecyclerView)object).getLayoutManager()) == null) {
            return;
        }
        string2 = (Parcelable)this.a.get(object2);
        if (string2 != null) {
            ((RecyclerView$o)object).onRestoreInstanceState((Parcelable)string2);
        } else {
            string2 = null;
            ((RecyclerView$o)object).scrollToPosition(0);
        }
        this.b.remove(object2);
    }

    public final void b(RecyclerView recyclerView, TT2$b tT2$b) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(tT2$b, "scrollKeyProvider");
        TT2$c tT2$c = new TT2$c(this, tT2$b);
        recyclerView.addOnScrollListener(tT2$c);
    }
}


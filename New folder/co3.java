/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
import android.view.ViewTreeObserver;
import com.facebook.login.widget.a;
import com.facebook.login.widget.a$a;
import java.lang.ref.Reference;
import kotlin.jvm.internal.Intrinsics;

public final class co3
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ a a;

    public /* synthetic */ co3(a a2) {
        this.a = a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onScrollChanged() {
        Throwable throwable2;
        Class<a> clazz;
        block4: {
            int n3;
            Object object = this.a;
            clazz = a.class;
            boolean bl2 = td0.b(clazz);
            if (bl2) {
                return;
            }
            Object object2 = "this$0";
            try {
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = object.b;
                object2 = ((Reference)object2).get();
                if (object2 == null) return;
                object2 = object.e;
                if (object2 == null) return;
                boolean bl3 = object2.isShowing();
                if (!bl3) return;
                bl2 = object2.isAboveAnchor();
                bl3 = false;
                n3 = 4;
                if (bl2) {
                    object = object.d;
                    if (object == null) return;
                    object2 = ((a$a)((Object)object)).a;
                    object2.setVisibility(n3);
                    object = ((a$a)((Object)object)).b;
                    object.setVisibility(0);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block4;
            }
            object = object.d;
            if (object == null) return;
            object2 = ((a$a)((Object)object)).a;
            object2.setVisibility(0);
            object = ((a$a)((Object)object)).b;
            object.setVisibility(n3);
            return;
        }
        td0.a(clazz, throwable2);
    }
}


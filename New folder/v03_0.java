/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V03
 */
public final class v03_0 {
    public final np_1 a;
    public final Ko b;

    public v03_0(np_1 object) {
        Intrinsics.checkNotNullParameter(object, "applySettingsClickListener");
        this.a = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.b = object = new Ko((Context)aJIOApplication);
    }
}


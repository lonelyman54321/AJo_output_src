/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.view.LayoutInflater;
import com.ril.ajio.R$layout;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HJ0
 */
public final class hj0_2
implements Function1 {
    public final Object invoke(Object object) {
        object = (Context)object;
        Intrinsics.checkNotNullParameter(object, "context");
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.address_bar_ui;
        return object.inflate(n3, null, false);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.pushtemplates.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from r73
 */
public class r73_0
extends q70_0 {
    public r73_0(int n3, uj3_1 uj3_12, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uj3_12, "renderer");
        super(n3, uj3_12, context);
        this.a();
        String string2 = uj3_12.c;
        this.h(string2);
        string2 = uj3_12.d;
        this.e(string2);
        string2 = uj3_12.r;
        this.b(string2);
        string2 = uj3_12.h;
        this.i(string2);
        string2 = uj3_12.i;
        this.f(string2);
        this.g();
        string2 = uj3_12.f;
        this.d(string2);
    }

    public /* synthetic */ r73_0(Context context, uj3_1 uj3_12) {
        int n3 = R$layout.content_view_small_single_line_msg;
        this(n3, uj3_12, context);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class P61
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ P61(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (uu_1)object;
                Intrinsics.checkNotNullParameter(object, "$this$buildSerialDescriptor");
                Function0 function0 = new Object();
                jm1_2 jm1_22 = new jm1_2(function0);
                uu_1.a((uu_1)object, "JsonPrimitive", jm1_22);
                function0 = new Object();
                jm1_22 = new jm1_2(function0);
                uu_1.a((uu_1)object, "JsonNull", jm1_22);
                function0 = new Object();
                jm1_22 = new jm1_2(function0);
                uu_1.a((uu_1)object, "JsonLiteral", jm1_22);
                function0 = new Object();
                jm1_22 = new jm1_2(function0);
                uu_1.a((uu_1)object, "JsonObject", jm1_22);
                function0 = new Object();
                jm1_22 = new jm1_2(function0);
                uu_1.a((uu_1)object, "JsonArray", jm1_22);
                return Unit.a;
            }
            case 0: 
        }
        object = (Context)object;
        Intrinsics.checkNotNullParameter(object, "context");
        object = LayoutInflater.from((Context)object);
        n3 = R$layout.fleek_store_switch_coach_mark_layout;
        object = object.inflate(n3, null, false);
        n3 = R$id.coach_mark_title_txt;
        View view = object.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        int n4 = R$id.coach_mark_sub_title_txt;
        View view2 = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        object2 = h40_0.a;
        object2 = h40_0.p(od3_2.a());
        String string2 = h40_0.n(od3_2.a());
        int n7 = ((String)object2).length();
        if (n7 > 0) {
            view.setText((CharSequence)object2);
        }
        if ((n3 = string2.length()) > 0) {
            view2.setText((CharSequence)string2);
        }
        return object;
    }
}


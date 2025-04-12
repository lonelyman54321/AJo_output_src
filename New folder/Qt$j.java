/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Qt$j
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ ob0_1 c;
    public final /* synthetic */ i90_0 d;

    public Qt$j(String string2, Activity activity, ob0_1 ob0_12, c80 c802, f80_0 f80_02) {
        this.a = string2;
        this.b = activity;
        this.c = ob0_12;
        this.d = c802;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Activity activity = this.b;
        Object object2 = this.d;
        i90_0 i90_02 = object2;
        i90_02 = (c80)object2;
        String string2 = this.a;
        ob0_1 ob0_12 = this.c;
        object2 = object;
        object = new Qt$j(string2, activity, ob0_12, (c80)i90_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (Qt$j)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((Qt$j)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (!bl2 && (j90_02 = this.b) != null) {
            Intrinsics.checkNotNull(object);
            ob0_1 ob0_12 = this.c;
            ob0_12.getClass();
            Intrinsics.checkNotNullParameter((Object)j90_02, "activity");
            Intrinsics.checkNotNullParameter(object, "plpLink");
            Object object2 = new Bundle();
            boolean bl3 = true;
            object2.putBoolean("plp-coupon-bonanza", bl3);
            object2.putString("BUNDLE_PLP_LINK", (String)object);
            Class<AjioHomeActivity> clazz = AjioHomeActivity.class;
            object = new Intent((Context)j90_02, clazz);
            object.putExtras(object2);
            j90_02.startActivity((Intent)object);
            bl2 = false;
            j90_02 = null;
            object = new Qt$j$a(ob0_12, null);
            int n3 = 3;
            object2 = this.d;
            Ae3.d((i90_0)object2, null, null, (Function2)object, n3);
        }
        return Unit.a;
    }
}


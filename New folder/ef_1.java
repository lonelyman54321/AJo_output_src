/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.autofill.AutofillManager
 */
import android.content.Context;
import android.view.View;
import android.view.autofill.AutofillManager;

/*
 * Renamed from ef
 */
public final class ef_1
implements Is {
    public final View a;
    public final bt b;
    public final AutofillManager c;

    public ef_1(View object, bt object2) {
        this.a = object;
        this.b = object2;
        object2 = object.getContext();
        Class clazz = af_0.a();
        object2 = cf_0.a(bf_0.a((Context)object2, clazz));
        if (object2 != null) {
            this.c = object2;
            df_1.a(object);
            return;
        }
        object2 = "Autofill service could not be located.".toString();
        super((String)object2);
        throw object;
    }
}


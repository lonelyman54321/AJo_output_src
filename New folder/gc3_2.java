/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/*
 * Renamed from GC3
 */
public final class gc3_2
extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    public gc3_2(Context object, Fragment fragment) {
        object.getClass();
        super(object);
        super(this);
        this.a = null;
        fragment.getClass();
        fragment.getLifecycle().a((lu1)object);
    }

    public gc3_2(LayoutInflater layoutInflater, Fragment fragment) {
        layoutInflater.getClass();
        Object object = layoutInflater.getContext();
        object.getClass();
        super(object);
        super(this);
        this.a = layoutInflater;
        fragment.getClass();
        fragment.getLifecycle().a((lu1)object);
    }

    public final Object getSystemService(String string2) {
        String string3 = "layout_inflater";
        boolean bl2 = string3.equals(string2);
        if (!bl2) {
            return this.getBaseContext().getSystemService(string2);
        }
        string2 = this.b;
        if (string2 == null) {
            string2 = this.a;
            if (string2 == null) {
                string2 = (LayoutInflater)this.getBaseContext().getSystemService(string3);
                this.a = string2;
            }
            string2 = this.a.cloneInContext((Context)this);
            this.b = string2;
        }
        return this.b;
    }
}


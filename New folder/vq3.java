/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.chuckerteam.chucker.R$string;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class vq3
extends i {
    public final String[] j;

    public vq3(Context stringArray, FragmentManager object) {
        Intrinsics.checkNotNullParameter(stringArray, "context");
        Intrinsics.checkNotNullParameter(object, "fm");
        super((FragmentManager)object, 1);
        int n3 = R$string.chucker_overview;
        object = stringArray.getString(n3);
        int n4 = R$string.chucker_request;
        String string2 = stringArray.getString(n4);
        int n7 = R$string.chucker_response;
        stringArray = stringArray.getString(n7);
        stringArray = new String[]{object, string2, stringArray};
        this.j = stringArray;
    }

    public final int c() {
        return this.j.length;
    }

    public final CharSequence e(int n3) {
        return this.j[n3];
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Fragment n(int n3) {
        Fragment fragment;
        if (n3 == 0) {
            return new uq3();
        }
        int n4 = 1;
        String string2 = "type";
        if (n3 == n4) {
            zn2 zn22 = zn2.REQUEST;
            Intrinsics.checkNotNullParameter((Object)zn22, string2);
            fragment = new aq3_0();
            Bundle bundle = new Bundle();
            bundle.putSerializable(string2, (Serializable)((Object)zn22));
            Unit unit = Unit.a;
            fragment.setArguments(bundle);
            return fragment;
        }
        n4 = 2;
        if (n3 == n4) {
            zn2 zn23 = zn2.RESPONSE;
            Intrinsics.checkNotNullParameter((Object)zn23, string2);
            fragment = new aq3_0();
            Bundle bundle = new Bundle();
            bundle.putSerializable(string2, (Serializable)((Object)zn23));
            Unit unit = Unit.a;
            fragment.setArguments(bundle);
            return fragment;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("no item");
        throw illegalArgumentException;
    }
}


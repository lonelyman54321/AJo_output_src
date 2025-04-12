/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.view.View
 */
package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.internal.zam;
import com.google.android.gms.common.internal.zax;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

public final class zaz
extends RemoteCreator {
    private static final zaz zaa;

    static {
        zaz zaz2;
        zaa = zaz2 = new zaz();
    }

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View zaa(Context object, int n3, int n4) {
        IObjectWrapper iObjectWrapper;
        zax zax2;
        Object object2 = zaa;
        int n7 = 1;
        try {
            zax2 = new zax(n7, n3, n4, null);
            iObjectWrapper = ObjectWrapper.wrap(object);
        }
        catch (Exception exception) {
            String string2 = D70.b(n3, n4, "Could not get button with size ", " and color ");
            object2 = new RemoteCreator$RemoteCreatorException(string2, exception);
            throw object2;
        }
        object = ((RemoteCreator)object2).getRemoteCreatorInstance((Context)object);
        object = (zam)object;
        object = ((zam)object).zae(iObjectWrapper, zax2);
        object = ObjectWrapper.unwrap((IObjectWrapper)object);
        return (View)object;
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder object) {
        if (object == null) {
            object = null;
        } else {
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
            boolean bl2 = iInterface instanceof zam;
            if (bl2) {
                object = iInterface;
                object = (zam)iInterface;
            } else {
                iInterface = new zam((IBinder)object);
                object = iInterface;
            }
        }
        return object;
    }
}


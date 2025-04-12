/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 */
package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.RemoteCreator$RemoteCreatorException;

public abstract class RemoteCreator {
    private final String zza;
    private Object zzb;

    public RemoteCreator(String string2) {
        this.zza = string2;
    }

    public abstract Object getRemoteCreator(IBinder var1);

    public final Object getRemoteCreatorInstance(Context object) {
        block11: {
            Object object2 = this.zzb;
            if (object2 == null) {
                Preconditions.checkNotNull(object);
                object = GooglePlayServicesUtilLight.getRemoteContext(object);
                if (object != null) {
                    ClassNotFoundException classNotFoundException2;
                    block14: {
                        InstantiationException instantiationException2;
                        block13: {
                            object = object.getClassLoader();
                            object2 = this.zza;
                            object = object.loadClass((String)object2);
                            object = object.newInstance();
                            object = (IBinder)object;
                            object = this.getRemoteCreator((IBinder)object);
                            try {
                                this.zzb = object;
                                break block11;
                            }
                            catch (IllegalAccessException illegalAccessException) {
                            }
                            catch (InstantiationException instantiationException2) {
                                break block13;
                            }
                            catch (ClassNotFoundException classNotFoundException2) {
                                break block14;
                            }
                            object2 = new RemoteCreator$RemoteCreatorException("Could not access creator.", illegalAccessException);
                            throw object2;
                        }
                        object2 = new RemoteCreator$RemoteCreatorException("Could not instantiate creator.", instantiationException2);
                        throw object2;
                    }
                    object2 = new RemoteCreator$RemoteCreatorException("Could not load creator class.", classNotFoundException2);
                    throw object2;
                }
                object = new RemoteCreator$RemoteCreatorException("Could not get remote context.");
                throw object;
            }
        }
        return this.zzb;
    }
}


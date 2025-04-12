/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class LibraryVersion {
    private static final GmsLogger zza;
    private static final LibraryVersion zzb;
    private final ConcurrentHashMap zzc;

    static {
        Object object = new GmsLogger("LibraryVersion", "");
        zza = object;
        zzb = object = new LibraryVersion();
    }

    public LibraryVersion() {
        ConcurrentHashMap concurrentHashMap;
        this.zzc = concurrentHashMap = new ConcurrentHashMap();
    }

    public static LibraryVersion getInstance() {
        return zzb;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String getVersion(String string2) {
        void var1_4;
        Object object;
        block15: {
            Object object2;
            Object object3;
            String string3;
            block12: {
                Object object4;
                Object object5;
                Object object6;
                block14: {
                    block13: {
                        block11: {
                            string3 = "LibraryVersion";
                            object3 = "Failed to get app version for libraryName: ";
                            object2 = "/";
                            Preconditions.checkNotEmpty(string2, "Please provide a valid libraryName");
                            object6 = this.zzc;
                            boolean bl2 = ((ConcurrentHashMap)object6).containsKey(string2);
                            if (bl2) {
                                return (String)this.zzc.get(string2);
                            }
                            object6 = new Properties();
                            object = null;
                            object5 = new StringBuilder((String)object2);
                            ((StringBuilder)object5).append(string2);
                            object2 = ".properties";
                            ((StringBuilder)object5).append((String)object2);
                            object2 = ((StringBuilder)object5).toString();
                            object5 = LibraryVersion.class;
                            object2 = ((Class)object5).getResourceAsStream((String)object2);
                            if (object2 == null) break block11;
                            try {
                                ((Properties)object6).load((InputStream)object2);
                                object5 = "version";
                                object = ((Properties)object6).getProperty((String)object5, null);
                                object6 = zza;
                                object5 = new StringBuilder();
                                ((StringBuilder)object5).append(string2);
                                String string4 = " version is ";
                                ((StringBuilder)object5).append(string4);
                                ((StringBuilder)object5).append((String)object);
                                object5 = ((StringBuilder)object5).toString();
                                ((GmsLogger)object6).v(string3, (String)object5);
                                break block12;
                            }
                            catch (Throwable throwable) {
                                break block13;
                            }
                            catch (IOException iOException) {
                                object4 = object;
                                object = object2;
                                object2 = object4;
                                break block14;
                            }
                        }
                        object6 = zza;
                        object5 = new StringBuilder((String)object3);
                        ((StringBuilder)object5).append(string2);
                        object5 = ((StringBuilder)object5).toString();
                        ((GmsLogger)object6).w(string3, (String)object5);
                        break block12;
                    }
                    object = object2;
                    break block15;
                    catch (IOException iOException) {
                        object6 = iOException;
                    }
                    object2 = null;
                }
                try {
                    object5 = zza;
                    StringBuilder stringBuilder = new StringBuilder((String)object3);
                    stringBuilder.append(string2);
                    object3 = stringBuilder.toString();
                    ((GmsLogger)object5).e(string3, (String)object3, (Throwable)object6);
                    object4 = object;
                    object = object2;
                    object2 = object4;
                }
                catch (Throwable throwable) {}
                break block15;
            }
            if (object2 != null) {
                IOUtils.closeQuietly((Closeable)object2);
            }
            if (object == null) {
                object3 = zza;
                object2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used";
                ((GmsLogger)object3).d(string3, (String)object2);
                object = "UNKNOWN";
            }
            this.zzc.put(string2, object);
            return object;
        }
        if (object != null) {
            IOUtils.closeQuietly(object);
        }
        throw var1_4;
    }
}


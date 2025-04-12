/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 *  org.xmlpull.v1.XmlPullParserFactory
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.model.zza;
import com.google.android.play.core.splitinstall.testing.zzu;
import com.google.android.play.core.splitinstall.testing.zzv;
import com.google.android.play.core.splitinstall.testing.zzw;
import com.google.android.play.core.splitinstall.testing.zzx;
import com.google.android.play.core.splitinstall.testing.zzy;
import com.google.android.play.core.splitinstall.testing.zzz;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public final class zzaa {
    private static final com.google.android.play.core.splitinstall.internal.zzu zza;
    private final XmlPullParser zzb;
    private final zzu zzc;

    static {
        com.google.android.play.core.splitinstall.internal.zzu zzu2;
        zza = zzu2 = new com.google.android.play.core.splitinstall.internal.zzu("LocalTestingConfigParser");
    }

    public zzaa(XmlPullParser object) {
        this.zzb = object;
        object = zzv.zzc();
        this.zzc = object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzv zza(File object) {
        String string2;
        int n3 = 1;
        Object object2 = Throwable.class;
        String string3 = "local_testing_config.xml";
        Object object3 = new File((File)object, string3);
        boolean bl2 = ((File)object3).exists();
        if (!bl2) {
            return zzv.zza;
        }
        object = new FileReader((File)object3);
        object3 = XmlPullParserFactory.newInstance();
        object3 = object3.newPullParser();
        object3.setInput((Reader)object);
        zzaa zzaa2 = new zzaa((XmlPullParser)object3);
        object3 = "local-testing-config";
        zzy zzy2 = new zzy(zzaa2);
        zzaa2.zze((String)object3, zzy2);
        object3 = zzaa2.zzc;
        object2 = ((zzu)object3).zze();
        ((Reader)object).close();
        return object2;
        catch (Throwable throwable) {
            try {
                ((Reader)object).close();
            }
            catch (Throwable throwable2) {
                Object[] objectArray = "addSuppressed";
                try {
                    Class[] classArray = new Class[n3];
                    classArray[0] = object2;
                    object2 = ((Class)object2).getDeclaredMethod((String)objectArray, classArray);
                    objectArray = new Object[n3];
                    objectArray[0] = throwable2;
                    ((Method)object2).invoke((Object)throwable, objectArray);
                }
                catch (Exception exception) {}
            }
            try {
                throw throwable;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (XmlPullParserException xmlPullParserException) {
            }
            catch (IOException iOException) {}
        }
        object2 = zza;
        string2 = ((Throwable)((Object)string2)).getMessage();
        object3 = new Object[2];
        object3[0] = string3;
        object3[n3] = string2;
        ((com.google.android.play.core.splitinstall.internal.zzu)object2).zze("%s can not be parsed, using default. Error: %s", (Object[])object3);
        return zzv.zza;
    }

    public static /* synthetic */ void zzb(zzaa zzaa2) {
        Object object;
        int n3;
        zzw zzw2 = null;
        for (int i3 = 0; i3 < (n3 = (object = zzaa2.zzb).getAttributeCount()); ++i3) {
            String string2 = "defaultErrorCode";
            object = zzaa2.zzb.getAttributeName(i3);
            n3 = (int)(string2.equals(object) ? 1 : 0);
            if (n3 == 0) continue;
            object = zzaa2.zzc;
            string2 = zzaa2.zzb.getAttributeValue(i3);
            int n4 = com.google.android.play.core.splitinstall.model.zza.zza(string2);
            ((zzu)object).zza(n4);
        }
        zzw2 = new zzw(zzaa2);
        zzaa2.zze("split-install-error", zzw2);
    }

    public static /* synthetic */ void zzc(zzaa zzaa2) {
        Object object;
        int n3;
        int n4;
        Object object2 = null;
        int n7 = 0;
        Integer n8 = null;
        String string2 = null;
        String string3 = null;
        for (n4 = 0; n4 < (n3 = (object = zzaa2.zzb).getAttributeCount()); ++n4) {
            String string4 = "module";
            object = zzaa2.zzb.getAttributeName(n4);
            n3 = (int)(string4.equals(object) ? 1 : 0);
            if (n3 != 0) {
                string2 = zzaa2.zzb.getAttributeValue(n4);
            }
            if ((n3 = (int)((string4 = "errorCode").equals(object = zzaa2.zzb.getAttributeName(n4)) ? 1 : 0)) == 0) continue;
            string3 = zzaa2.zzb.getAttributeValue(n4);
        }
        if (string2 != null && string3 != null) {
            object2 = zzaa2.zzc;
            n7 = com.google.android.play.core.splitinstall.model.zza.zza(string3);
            object2 = ((zzu)object2).zzd();
            n8 = n7;
            object2.put(string2, n8);
            while ((n4 = (object2 = zzaa2.zzb).next()) != (n7 = 3)) {
            }
            return;
        }
        zzaa2 = zzaa2.zzb;
        object2 = new XmlPullParserException("'split-install-error' element does not contain 'module'/'errorCode' attributes.", (XmlPullParser)zzaa2, null);
        throw object2;
    }

    private final void zze(String string2, zzz object) {
        int n3;
        Object object2;
        int n4;
        while ((n4 = (object2 = this.zzb).next()) != (n3 = 3) && n4 != (n3 = 1)) {
            object2 = this.zzb;
            n4 = object2.getEventType();
            if (n4 != (n3 = 2)) continue;
            object2 = this.zzb.getName();
            n4 = (int)(((String)object2).equals(string2) ? 1 : 0);
            if (n4 != 0) {
                object.zza();
                continue;
            }
            object2 = this.zzb.getName();
            string2 = uc0_0.a("Expected '", string2, "' tag but found '", (String)object2, "'.");
            object2 = this.zzb;
            object = new XmlPullParserException(string2, (XmlPullParser)object2, null);
            throw object;
        }
    }

    public final /* synthetic */ void zzd() {
        zzx zzx2 = new zzx(this);
        this.zze("split-install-errors", zzx2);
    }
}


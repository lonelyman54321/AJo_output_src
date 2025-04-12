/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$OnChecksumsReadyListener
 */
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzazu;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from oK3
 */
public final class ok3_2 {
    public static /* bridge */ /* synthetic */ void a(PackageManager packageManager, String string2, ArrayList arrayList, zzazu zzazu2) {
        packageManager.requestChecksums(string2, false, 8, (List)arrayList, (PackageManager.OnChecksumsReadyListener)zzazu2);
    }
}


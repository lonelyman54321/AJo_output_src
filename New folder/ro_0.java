/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Process
 */
import android.os.Process;
import com.google.android.gms.measurement.internal.zzjw;
import com.google.android.gms.measurement.internal.zzjx;
import java.util.Comparator;

/*
 * Renamed from Ro
 */
public final class ro_0 {
    public static /* bridge */ /* synthetic */ long a() {
        return Process.getStartElapsedRealtime();
    }

    public static /* bridge */ /* synthetic */ Comparator b(zzjx zzjx2, zzjw zzjw2) {
        return Comparator.comparing(zzjx2, zzjw2);
    }
}


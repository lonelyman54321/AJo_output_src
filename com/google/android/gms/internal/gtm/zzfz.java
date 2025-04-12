/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.gtm.zzgb;
import com.google.android.gms.internal.gtm.zzgc;
import com.google.android.gms.internal.gtm.zzhi;
import java.io.IOException;

final class zzfz
implements zzgb {
    final /* synthetic */ zzgc zza;

    public zzfz(zzgc zzgc2) {
        this.zza = zzgc2;
    }

    public final AdvertisingIdClient$Info zza() {
        AdvertisingIdClient$Info advertisingIdClient$Info;
        block8: {
            IllegalStateException illegalStateException2;
            block13: {
                GooglePlayServicesRepairableException googlePlayServicesRepairableException2;
                block12: {
                    IOException iOException2;
                    block11: {
                        GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException2;
                        block10: {
                            advertisingIdClient$Info = null;
                            zzgc zzgc2 = this.zza;
                            zzgc2 = zzgc.zza(zzgc2);
                            try {
                                advertisingIdClient$Info = AdvertisingIdClient.getAdvertisingIdInfo((Context)zzgc2);
                                break block8;
                            }
                            catch (Exception exception) {
                            }
                            catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException2) {
                                break block10;
                            }
                            catch (IOException iOException2) {
                                break block11;
                            }
                            catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException2) {
                                break block12;
                            }
                            catch (IllegalStateException illegalStateException2) {
                                break block13;
                            }
                            String string2 = "Unknown exception. Could not get the Advertising Id Info.";
                            zzhi.zzf(string2, exception);
                            break block8;
                        }
                        zzgc.zzd(this.zza, false);
                        String string3 = "GooglePlayServicesNotAvailableException getting Advertising Id Info";
                        zzhi.zzf(string3, googlePlayServicesNotAvailableException2);
                        break block8;
                    }
                    String string4 = "IOException getting Ad Id Info";
                    zzhi.zzf(string4, iOException2);
                    break block8;
                }
                String string5 = "GooglePlayServicesRepairableException getting Advertising Id Info";
                zzhi.zzf(string5, googlePlayServicesRepairableException2);
                break block8;
            }
            String string6 = "IllegalStateException getting Advertising Id Info";
            zzhi.zzf(string6, illegalStateException2);
        }
        return advertisingIdClient$Info;
    }
}


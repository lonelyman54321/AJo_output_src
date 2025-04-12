/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.session.PerfSession$1;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession$Builder;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PerfSession
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final Timer creationTime;
    private boolean isGaugeAndEventCollectionEnabled;
    private final String sessionId;

    static {
        PerfSession$1 perfSession$1 = new PerfSession$1();
        CREATOR = perfSession$1;
    }

    private PerfSession(Parcel object) {
        String string2;
        boolean bl2 = false;
        ClassLoader classLoader = null;
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = string2 = object.readString();
        byte by2 = object.readByte();
        if (by2 != 0) {
            bl2 = true;
        }
        this.isGaugeAndEventCollectionEnabled = bl2;
        classLoader = Timer.class.getClassLoader();
        object = (Timer)object.readParcelable(classLoader);
        this.creationTime = object;
    }

    public /* synthetic */ PerfSession(Parcel parcel, PerfSession$1 perfSession$1) {
        this(parcel);
    }

    public PerfSession(String object, Clock clock) {
        this.isGaugeAndEventCollectionEnabled = false;
        this.sessionId = object;
        this.creationTime = object = clock.getTime();
    }

    public static com.google.firebase.perf.v1.PerfSession[] buildAndSort(List list) {
        int n3;
        int n4 = list.isEmpty();
        if (n4 != 0) {
            return null;
        }
        n4 = list.size();
        com.google.firebase.perf.v1.PerfSession[] perfSessionArray = new com.google.firebase.perf.v1.PerfSession[n4];
        com.google.firebase.perf.v1.PerfSession perfSession = ((PerfSession)list.get(0)).build();
        boolean bl2 = false;
        for (int i3 = 1; i3 < (n3 = list.size()); ++i3) {
            PerfSession perfSession2;
            boolean bl3;
            com.google.firebase.perf.v1.PerfSession perfSession3 = ((PerfSession)list.get(i3)).build();
            if (!bl2 && (bl3 = (perfSession2 = (PerfSession)list.get(i3)).isVerbose())) {
                perfSessionArray[0] = perfSession3;
                perfSessionArray[i3] = perfSession;
                bl2 = true;
                continue;
            }
            perfSessionArray[i3] = perfSession3;
        }
        if (!bl2) {
            perfSessionArray[0] = perfSession;
        }
        return perfSessionArray;
    }

    public static PerfSession createWithId(String string2) {
        string2 = string2.replace("-", "");
        Clock clock = new Clock();
        PerfSession perfSession = new PerfSession(string2, clock);
        boolean bl2 = PerfSession.shouldCollectGaugesAndEvents();
        perfSession.setGaugeAndEventCollectionEnabled(bl2);
        return perfSession;
    }

    public static boolean isVerbose(com.google.firebase.perf.v1.PerfSession object) {
        boolean bl2;
        object = ((com.google.firebase.perf.v1.PerfSession)object).getSessionVerbosityList().iterator();
        while (bl2 = object.hasNext()) {
            SessionVerbosity sessionVerbosity;
            SessionVerbosity sessionVerbosity2 = (SessionVerbosity)object.next();
            if (sessionVerbosity2 != (sessionVerbosity = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS)) continue;
            return true;
        }
        return false;
    }

    public static boolean shouldCollectGaugesAndEvents() {
        double d2;
        double d5;
        double d7;
        int n3;
        ConfigResolver configResolver = ConfigResolver.getInstance();
        boolean bl2 = configResolver.isPerformanceMonitoringEnabled();
        if (bl2 && (n3 = (d7 = (d5 = Math.random()) - (d2 = configResolver.getSessionsSamplingRate())) == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1)) < 0) {
            n3 = 1;
        } else {
            n3 = 0;
            configResolver = null;
        }
        return n3 != 0;
    }

    public com.google.firebase.perf.v1.PerfSession build() {
        PerfSession$Builder perfSession$Builder = com.google.firebase.perf.v1.PerfSession.newBuilder();
        Object object = this.sessionId;
        perfSession$Builder = perfSession$Builder.setSessionId((String)object);
        boolean bl2 = this.isGaugeAndEventCollectionEnabled;
        if (bl2) {
            object = SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
            perfSession$Builder.addSessionVerbosity((SessionVerbosity)object);
        }
        return (com.google.firebase.perf.v1.PerfSession)perfSession$Builder.build();
    }

    public int describeContents() {
        return 0;
    }

    public Timer getTimer() {
        return this.creationTime;
    }

    public boolean isGaugeAndEventCollectionEnabled() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public boolean isSessionRunningTooLong() {
        boolean bl2;
        ConfigResolver configResolver;
        long l2;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        Timer timer = this.creationTime;
        long l3 = timer.getDurationMicros();
        long l4 = timeUnit.toMinutes(l3);
        long l7 = l4 - (l2 = (configResolver = ConfigResolver.getInstance()).getSessionsMaxDurationMinutes());
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            timeUnit = null;
        }
        return bl2;
    }

    public boolean isVerbose() {
        return this.isGaugeAndEventCollectionEnabled;
    }

    public String sessionId() {
        return this.sessionId;
    }

    public void setGaugeAndEventCollectionEnabled(boolean bl2) {
        this.isGaugeAndEventCollectionEnabled = bl2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Object object = this.sessionId;
        parcel.writeString((String)object);
        n3 = (byte)(this.isGaugeAndEventCollectionEnabled ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.creationTime;
        parcel.writeParcelable((Parcelable)object, 0);
    }
}


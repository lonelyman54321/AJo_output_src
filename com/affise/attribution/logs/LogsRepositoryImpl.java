/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.converter.Converter;
import com.affise.attribution.logs.AffiseLog;
import com.affise.attribution.logs.AffiseLogType;
import com.affise.attribution.logs.LogsRepository;
import com.affise.attribution.logs.SerializedLog;
import com.affise.attribution.storages.LogsStorage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class LogsRepositoryImpl
implements LogsRepository {
    private final Converter converterToBase64;
    private final Converter converterToSerializedLog;
    private final LogsStorage logsStorage;

    public LogsRepositoryImpl(Converter converter, Converter converter2, LogsStorage logsStorage) {
        Intrinsics.checkNotNullParameter(converter, "converterToBase64");
        Intrinsics.checkNotNullParameter(converter2, "converterToSerializedLog");
        Intrinsics.checkNotNullParameter(logsStorage, "logsStorage");
        this.converterToBase64 = converter;
        this.converterToSerializedLog = converter2;
        this.logsStorage = logsStorage;
    }

    public void clear() {
        this.logsStorage.clear();
    }

    public void deleteLogs(List list, String string2) {
        Intrinsics.checkNotNullParameter(list, "ids");
        Intrinsics.checkNotNullParameter(string2, "url");
        LogsStorage logsStorage = this.logsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        AffiseLogType[] affiseLogTypeArray = AffiseLogType.values();
        int n3 = affiseLogTypeArray.length;
        ArrayList<AffiseLogType> arrayList = new ArrayList<AffiseLogType>(n3);
        for (Object object : affiseLogTypeArray) {
            Converter converter = this.converterToBase64;
            object = object.getType();
            object = (String)converter.convert(object);
            arrayList.add((AffiseLogType)((Object)object));
        }
        logsStorage.deleteLogs(string2, arrayList, list);
    }

    public List getLogs(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        LogsStorage logsStorage = this.logsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        AffiseLogType[] affiseLogTypeArray = AffiseLogType.values();
        int n3 = affiseLogTypeArray.length;
        ArrayList<AffiseLogType> arrayList = new ArrayList<AffiseLogType>(n3);
        for (Object object : affiseLogTypeArray) {
            Converter converter = this.converterToBase64;
            object = object.getType();
            object = (String)converter.convert(object);
            arrayList.add((AffiseLogType)((Object)object));
        }
        return logsStorage.getLogs(string2, arrayList);
    }

    public boolean hasLogs(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        LogsStorage logsStorage = this.logsStorage;
        string2 = (String)this.converterToBase64.convert(string2);
        AffiseLogType[] affiseLogTypeArray = AffiseLogType.values();
        int n3 = affiseLogTypeArray.length;
        ArrayList<AffiseLogType> arrayList = new ArrayList<AffiseLogType>(n3);
        for (Object object : affiseLogTypeArray) {
            Converter converter = this.converterToBase64;
            object = object.getType();
            object = (String)converter.convert(object);
            arrayList.add((AffiseLogType)((Object)object));
        }
        return logsStorage.hasLogs(string2, arrayList);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void storeLog(AffiseLog affiseLog, List object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2 = "log";
                try {
                    boolean bl2;
                    Intrinsics.checkNotNullParameter(affiseLog, (String)object2);
                    object2 = "urls";
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object = (Iterable)object;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        object2 = object.next();
                        LogsStorage logsStorage = this.logsStorage;
                        Object object3 = this.converterToBase64;
                        object2 = object3.convert(object2);
                        object2 = (String)object2;
                        object3 = this.converterToBase64;
                        Object object4 = affiseLog.getName();
                        object4 = ((AffiseLogType)((Object)object4)).getType();
                        object3 = object3.convert(object4);
                        object3 = (String)object3;
                        object4 = this.converterToSerializedLog;
                        object4 = object4.convert(affiseLog);
                        object4 = (SerializedLog)object4;
                        logsStorage.saveLog((String)object2, (String)object3, (SerializedLog)object4);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}


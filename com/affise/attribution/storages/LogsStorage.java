/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.storages;

import com.affise.attribution.logs.SerializedLog;
import java.util.List;

public interface LogsStorage {
    public void clear();

    public void deleteLogs(String var1, List var2, List var3);

    public List getLogs(String var1, List var2);

    public boolean hasLogs(String var1, List var2);

    public void saveLog(String var1, String var2, SerializedLog var3);
}


/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.logs;

import com.affise.attribution.logs.AffiseLog;
import java.util.List;

public interface LogsRepository {
    public void clear();

    public void deleteLogs(List var1, String var2);

    public List getLogs(String var1);

    public boolean hasLogs(String var1);

    public void storeLog(AffiseLog var1, List var2);
}


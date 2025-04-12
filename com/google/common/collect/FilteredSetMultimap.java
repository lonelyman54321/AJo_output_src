/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.FilteredMultimap;
import com.google.common.collect.SetMultimap;

interface FilteredSetMultimap
extends FilteredMultimap,
SetMultimap {
    public SetMultimap unfiltered();
}


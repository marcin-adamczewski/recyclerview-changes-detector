/*
 * Copyright 2016 Jacek Marchwicki <jacek.marchwicki@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.jacekmarchwicki.universaladapter.rx;
import androidx.recyclerview.widget.RecyclerView;

import com.jacekmarchwicki.universaladapter.BaseAdapterItem;
import com.jacekmarchwicki.universaladapter.UniversalAdapter;
import com.jacekmarchwicki.universaladapter.ViewHolderManager;

import java.util.List;

import javax.annotation.Nonnull;

import rx.functions.Action1;

/**
 * Universal adapter for {@link RecyclerView} that will automatically detect changes designed for
 * rx-java
 */
public class RxUniversalAdapter extends UniversalAdapter implements Action1<List<? extends BaseAdapterItem>> {

    public RxUniversalAdapter(@Nonnull List<? extends ViewHolderManager> managers) {
        super(managers);
    }

}

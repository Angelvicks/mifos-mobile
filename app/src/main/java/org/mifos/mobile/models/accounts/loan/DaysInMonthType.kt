package org.mifos.mobile.models.accounts.loan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Rajan Maurya on 04/03/17.
 */

@Parcelize
data class DaysInMonthType(
        var id: Int? = null,

        var code: String? = null,

        var value: String? = null
) : Parcelable
package io.github.grishaninvyacheslav.polus_dispatcher.ui.adapters.sheet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yandex.mapkit.MapKitFactory
import io.github.grishaninvyacheslav.polus_dispatcher.databinding.ItemSheetEntryBinding

class SheetListAdapter(
    private val dataModel: ISheetDataModel,
    private var onItemClick: ((view: ISheetItemView) -> Unit)
) : RecyclerView.Adapter<SheetEntryViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        SheetEntryViewHolder(
            ItemSheetEntryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )

    override fun onViewAttachedToWindow(holder: SheetEntryViewHolder) {
        super.onViewAttachedToWindow(holder)
        holder.onStart()
    }

    override fun onViewDetachedFromWindow(holder: SheetEntryViewHolder) {
        super.onViewDetachedFromWindow(holder)
        holder.onStop()
    }

    override fun getItemCount() = dataModel.getCount()

    override fun onBindViewHolder(logEntryView: SheetEntryViewHolder, position: Int) =
        dataModel.bindView(logEntryView.apply { pos = position })
}
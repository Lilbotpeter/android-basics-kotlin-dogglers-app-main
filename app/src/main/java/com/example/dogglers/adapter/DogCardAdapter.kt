/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.model.Dog
import com.example.dogglers.R
import com.example.dogglers.const.Layout
import com.example.dogglers.data.DataSource

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
    //private val dataset: List<Dog>
): RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {
    private val data = DataSource.dogs
    // TODO: Initialize the data using the List found in data/DataSource

    /**
     * Initialize view elements
     */
    class DogCardViewHolder(private val view: View?): RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
        val header:TextView? = view?.findViewById(R.id.title)
        val sub1:TextView? = view?.findViewById(R.id.subtitle1)
        val sub2:TextView? = view?.findViewById(R.id.subtitle2)
        val cover:ImageView? = view?.findViewById(R.id.cover)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.

        val layoutType = if (layout == Layout.GRID)R.layout.grid_list_item else R.layout.vertical_horizontal_list_item

        val apapterLayout = LayoutInflater.from(parent.context)
            .inflate(layoutType,parent,false)

        return DogCardViewHolder(apapterLayout)
    }

    override fun getItemCount(): Int = DataSource.dogs.size //

    override fun onBindViewHolder(holder: DogCardAdapter.DogCardViewHolder, position: Int) {

        val resources = context?.resources
        val data = DataSource.dogs[position]
        holder.cover!!.setImageResource(data.imageResourceId)
        holder.header!!.text = data.name
        holder.sub1!!.text=resources?.getString(R.string.dog_age,data.age)
        holder.sub2!!.text = resources?.getString(R.string.dog_hobbies,data.hobbies)

    }


}

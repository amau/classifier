package me.util;

import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

public class Helper
{
	public static void setCellFactory(ListView<Animal> list)
	{
		list.setCellFactory(new Callback<ListView<Animal>, ListCell<Animal>>()
		{

			@Override
			public ListCell<Animal> call(ListView<Animal> p)
			{

				ListCell<Animal> cell = new ListCell<Animal>()
				{

					@Override
					protected void updateItem(Animal t, boolean bln)
					{
						super.updateItem(t, bln);
						if (t != null)
						{
							setText(t.getFileName());
						}
					}

				};

				return cell;
			}
		});
	}
}

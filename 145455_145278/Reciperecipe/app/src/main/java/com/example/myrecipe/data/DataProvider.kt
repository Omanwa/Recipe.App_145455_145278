package com.example.recipeapp.data

import com.example.myrecipe.R
import com.example.myrecipe.data.Recipe


object DataProvider {

    val recipeList = listOf(
        Recipe(
            id = 1,
            title = "Grilled Cheese Sandwiches",
            meal = "Breakfast",
            serves = "2 people",
            difficulty = "Beginner",
            ingredients = "Bread – a thicker sliced bread such as texas toast works best\n" +
                    "Butter – use a generous 1/2 Tbsp of butter on each slice of bread. We use unsalted but any butter will work here.\n" +
                    "Cheese – we use a combination of sliced medium cheddar, gouda and Havarti cheese.",
            steps = "1. Butter the toast – spread 1/2 Tbsp butter on one side of each slice of bread.\n" +
                    "2. Heat skillet – place a skillet over low to medium/low heat. A griddle should be at 275˚F. Immediately add 2 slices of bread with the butter-side-down.\n" +
                    "3. Add cheese – stack cheeses on one of the pieces of bread, cover with the other piece of toast and flip the sandwich over.\n" +
                    "4. Brown the toast – Continue sauteeing, flipping once, until both sides are golden brown and cheese is melted.\n" +
                    "5.Serve – cut the sandwich in half on the diagonal to serve.",
            recipeImageId = R.drawable.image1
        ),
        Recipe(
            id = 2,
            title = "Sloppy Joes",
            meal = "Lunch/Dinner",
            serves = "5 people",
            difficulty = "Intermediate",
            ingredients =  "Ground Beef – use lean ground beef (85-90% lean). If using a higher fat content, you will need to skim off the extra fat once the beef is cooked.\n" +
                    "Bell pepper – we used green, but you can substitute a different color in a pinch.\n" +
                    "Onion & Garlic – these aromatics add great flavor and disappear into the sauce so picky eaters won’t complain.\n" +
                    "Homemade Sauce – just a few simple pantry ingredients will make a sauce that’s better than any store-bought sauce. The combination of tomato sauce, brown sugar, yellow mustard, and Worcestershire hits all the right flavor notes; sweet, savory, and tangy.\n",
            steps = "1. Chop veggies – Finely chop the onion and green bell pepper.\n" +
                    "2. Make sauce – In a bowl, combine worcestershire sauce, yellow mustard, water, brown sugar, and tomato sauce.\n" +
                    "3. Saute beef – In a deep skillet, heat oil over med/high heat. Add the ground beef and break up as it is being cooked. Season with salt and pepper and add in the finely chopped onion and green pepper. Cook until vegetables are tender.\n" +
                    "4. Add sauce – Add in the garlic and cook until fragrant. Pour in the sauce and cook over medium high heat until the sauce comes to a soft boil.\n" +
                    "5. Simmer – Reduce the heat to low and cook for 10 minutes, add more salt and pepper if needed.\n" +
                    "6. Serve – spoon the saucy beef mixture on toasted buns and serve as sandwiches.",
            recipeImageId = R.drawable.image2
        ),
        Recipe(
            id = 3,
            title = "Easy Pancakes",
            meal = "Breakfast",
            serves = "10 people",
            difficulty = "Intermediate",
            ingredients = "· Flour: This homemade pancake recipe starts with all-purpose flour.\n" +
                    "· Baking powder: Baking powder, a leavener, is the secret to fluffy pancakes.\n" +
                    "· Sugar: Just a tablespoon of white sugar is all you'll need for subtly sweet pancakes.\n" +
                    "· Salt: A pinch of salt will enhance the overall flavor without making your pancakes taste salty.\n" +
                    "· Milk and butter: Milk and butter add moisture and richness to the pancakes.\n" +
                    "· Egg: A whole egg lends even more moisture. Plus, it helps bind the pancake batter together.",
            steps = "1. Sift the dry ingredients together.\n" +
                    "2. Make a well, then add the wet ingredients. Stir to combine.\n" +
                    "3. Scoop the batter onto a hot griddle or pan.\n" +
                    "4. Cook for two to three minutes, then flip.\n" +
                    "5. Continue cooking until brown on both sides.",
            recipeImageId = R.drawable.image3
        ),
        Recipe(
            id = 4,
            title = "Waffles",
            meal = "Breakfast",
            serves = "5 people",
            difficulty = "Hard",
            ingredients= "· 2 cups all-purpose flour\n" +
                    "\n" +
                    "1 teaspoon salt\n" +
                    "\n" +
                    "4 teaspoons baking powder\n" +
                    "\n" +
                    "2 tablespoons white sugar\n" +
                    "\n" +
                    "2 eggs\n" +
                    "\n" +
                    "1 ½ cups warm milk\n" +
                    "\n" +
                    "⅓ cup butter, melted\n" +
                    "\n" +
                    "1 teaspoon vanilla extract",
            steps = "1. Oil the waffle maker.\n" +
                    "2. Sift the dry ingredients together in a large bowl.\n" +
                    "3. In separate bowl, separate egg whites and beat until stiff peaks form.\n" +
                    "4. In a separate bowl, mix together the egg yolks, milk, oil , and vanilla, stir slightly.\n" +
                    "5. dd to dry ingredients and mix well.\n" +
                    "6. Fold in egg whites.\n" +
                    "7. Cook in waffle iron on medium-high heat for around 5-10 minutes.",
            recipeImageId = R.drawable.image4
        ),
        Recipe(
            id = 5,
            title = "Cinnamon Rolls",
            meal = "Breakfast",
            serves = "12 people",
            difficulty = "Hard",
            ingredients= "· Flour: Flour provides the dough structure. All-purpose flour is best for these cinnamon rolls. You could also use bread flour—the rolls will be chewier.\n" +
                    "Sugar: You need white granulated sugar in the dough, both for flavor and to feed the yeast.\n" +
                    "Salt: Flavor.\n" +
                    "Whole milk: Whole milk is ideal for the richest-tasting cinnamon rolls. Buttermilk works just as well without any changes to the recipe. Many readers have successfully substituted nondairy milks. In a pinch, you can use low-fat milk, but avoid using nonfat milk.\n" +
                    "Butter: This is a rich dough, meaning it has fat to help guarantee softness.\n" +
                    "Egg: Like butter, egg promises a softer, richer dough.",
            steps = "Don’t overheat your milk. It should be between 105-115 degrees F. Anything hotter is likely to kill the yeast, which means the cinnamon rolls will not rise. A simple tip is to dip your finger in the milk — it should feel warm similar to warm bath water but not HOT. If you warmed it up too much, simply wait a few minutes until it cools down enough to touch.\n" +
                    "Make sure to use room temperature butter for the filling: a lot of recipes call for using melted butter in the filling, but that will cause the filling to leak out before baking. Room temperature butter is best!\n" +
                    "Rub the brown sugar into the butter: after you spread out the softened butter, it’s important to rub the brown sugar into the butter and dough so that it’s well combined. Please refer to the video!\n" +
                    "Use a room temperature egg in the dough: if you use a cold egg, there’s a chance it could affect the yeast or mix with the melted butter and cause it to coagulate. To bring your eggs to room temperature simply place them in a bowl of warm water for a few minutes.\n" +
                    "Use bread flour: bread flour is available at most grocery stores and it makes ALL the difference in achieving softer, fluffy, perfect cinnamon rolls. JUST TRUST ME.\n" +
                    "Make sure you flour your work surface and the rolling pin: this is to prevent the cinnamon rolls from sticking to the surface or to the rolling pin.",
            recipeImageId = R.drawable.image5
        ),
        Recipe(
            id = 6,
            title = "Breakfast Burritos",
            meal = "Breakfast",
            serves = "2 people",
            difficulty = "Intermediate",
            ingredients= "Olive Oil: For sautéing the vegetables.\n" +
                    "Vegetables: Here’s where you have lots of flexibility! Use your favorite veggies or whatever you have to use up in your fridge. I used a combination of red onion, bell pepper and mushrooms.\n" +
                    "Breakfast Sausage: Sausage adds so much flavor to a breakfast burrito! If you can’t find breakfast sausage, you can substitute Italian sausage. Remove the sausage from the casings before browning it in the skillet.\n" +
                    "Eggs, Salt and Butter: These ingredients are for the scrambled eggs. Seasoning the eggs with a few pinches of salt enhances the flavor, as does scrambling the eggs in butter.\n" +
                    "Tortillas: You’ll need large burrito-size tortillas so that you can fit plenty of filling in each one and still wrap the burritos up tightly.\n" +
                    "Cheese: Gooey, melty cheese is a must! I like to use shredded sharp cheddar. Monterey jack cheese also works well, or, if you like spice, pepper jack.\n" +
                    "Vegetarian Swap: Substitute black beans for the sausage for vegetarian breakfast burritos. Or try this Vegetarian Breakfast Burrito recipe.\n" +
                    "\n" +
                    "MORE MIX-IN OPTIONS:\n" +
                    "Salsa or Pico de Gallo: These are a great way to add more flavor! I don’t recommend adding them if you plan to freeze the burritos, as salsa can lead to sogginess over time.\n" +
                    "Avocado: You can add avocado slices to the burritos if you plan to serve them right away.\n" +
                    "Potatoes: Try adding cooked hash browns, Breakfast Potatoes or Roasted Sweet Potatoes to your breakfast burrito.\n",
            steps = "For the potatoes: Place the potatoes in a large pot and cover with water. Bring to a boil over high heat then reduce heat to medium-low to simmer. Cook for 15-20 minutes until fork tender (but not too tender!) Remove from the pot and let cool. Once cool enough to handle, dice into 1-inch pieces and let cool completely.\n" +
                    "2\n" +
                    "Heat a large, cast-iron skillet over medium-high heat. Add the olive oil, red and green bell peppers, and half of the salt and pepper. Cook until the edges are a teeny bit black, 8-10 minutes, then remove them from the skillet and set aside.\n" +
                    "3\n" +
                    "Add the potatoes and remaining half of the salt and pepper to the skillet. Cook for about 10 minutes, stirring occasionally. Add the peppers back in the skillet. Stir and cook another 10 minutes until golden brown. Remove from the skillet and set aside.\n" +
                    "4\n" +
                    "For the burritos: Return the same skillet to medium heat. Add the sausage and cook, breaking it up into small pieces with a wooden spoon, until browned, about 10 minutes.\n" +
                    "5\n" +
                    "Meanwhile, in a large bowl, whisk together the eggs, chives, seasoned salt, ground black pepper, and half of the cheese. If you’re feeling saucy, add some cayenne pepper or hot sauce for a little kick.\n" +
                    "6\n" +
                    "Drain off some of the fat from the sausage, then add in the breakfast potatoes and stir to combine over low heat. Pour the egg mixture over the potato mixture. Cook over medium-low heat and turn them occasionally to cook. You don’t want to stir them too much or the potatoes will fall apart and become mushy.\n" +
                    "7\n" +
                    "When the eggs are fully cooked, add the rest of the cheese and stir once more. Warm the tortillas and add some of the egg mixture (about 3/4 cup). Wrap them up and, if they need to be kept warm for a bit, wrap them individually in sheets of foil and hold them in a slow cooker on warm for up to 3 hours.\n" +
                    "Tip: You can use frozen potatoes in place of cooked! You'll need about 4 cups. ",
            recipeImageId = R.drawable.image6
        ),
        Recipe(
            id = 7,
            title = "Cheese and egg bacon sandwich",
            meal = "Breakfast",
            serves = "1 person",
            difficulty = "Beginner",
            ingredients= "Unsalted butter, as needed\n" +
                    "1kaiser roll, split (or 1 bagel, split, or 2 slices of bread, toasted and buttered)\n" +
                    "3slices beef, pork or turkey bacon (not thick-cut), halved crosswise\n" +
                    "2large eggs, beaten with a fork\n" +
                    "Kosher salt and black pepper\n" +
                    "2slices American cheese\n" +
                    "Ketchup and/or hot sauce (optional)",
            steps = "Step 1\n" +
                    "Bring a large piece of parchment paper or foil to the stove. Heat a medium (10-inch) nonstick skillet over medium. Grease the skillet generously with butter. Place one side of the roll in the skillet, cut-side down, and toast until golden, 2 to 4 minutes. Transfer the toasted half to the parchment, cut-side up. Repeat with more butter and the other half of the roll. (The second side will take less time, as the pan gets hotter.)\n" +
                    "\n" +
                    "Step 2\n" +
                    "If you’re using beef or turkey bacon, add 1 tablespoon butter to the skillet. Add the bacon and cook over medium until browned and crisp, 2 to 4 minutes per side. As the bacon cooks, press it down with a spatula. (This helps the fat render, producing crunchier bacon.) Turn off the heat and transfer the bacon to the bottom roll. Pour off all but 1 tablespoon of the fat.\n" +
                    "\n" +
                    "Step 3\n" +
                    "Pour the eggs into the skillet, season with salt and pepper and set over medium-low. Using a spatula, pull the egg toward the center and tilt the skillet so the egg runs to the empty part of the skillet. Repeat this all around until the surface of the egg is no longer runny but still shiny. Add the cheese on the top, tearing into smaller pieces for even coverage. Cook, undisturbed, until the top of the egg is matte, just a minute. Remove from heat, fold the egg in half, and then in half again. Transfer to the bottom roll.\n" +
                    "\n" +
                    "Step 4\n" +
                    "Add ketchup and hot sauce as desired, then add the top roll and press down. Wrap in the parchment, smush again, and let sit for a couple minutes for all the elements to steam together. Cut in half and eat.",
            recipeImageId = R.drawable.image7
        ),
        Recipe(
            id = 8,
            title = "Cream of mushroom soup",
            meal = "dinner starter",
            serves = "1 person",
            difficulty = "Intermediate",
            ingredients= "90g butter\n" +
                    "2 medium onions, roughly chopped\n" +
                    "1 garlic clove, crushed\n" +
                    "500g mushrooms, finely chopped (chestnut or button mushrooms work well)\n" +
                    "2 tbsp plain flour\n" +
                    "1l hot chicken stock\n" +
                    "1 bay leaf\n" +
                    "4 tbsp single cream\n" +
                    "small handful flat-leaf parsley, roughly chopped, to serve (optional)",
            steps = "STEP 1\n" +
                    "Heat the butter in a large saucepan and cook the onions and garlic until soft but not browned, about 8-10 mins.\n" +
                    "\n" +
                    "STEP 2\n" +
                    "Add the mushrooms and cook over a high heat for another 3 mins until softened. Sprinkle over the flour and stir to combine. Pour in the chicken stock, bring the mixture to the boil, then add the bay leaf and simmer for another 10 mins.\n" +
                    "\n" +
                    "STEP 3\n" +
                    "Remove and discard the bay leaf, then remove the mushroom mixture from the heat and blitz using a hand blender until smooth. Gently reheat the soup and stir through the cream (or, you could freeze the soup at this stage – simply stir through the cream when heating). Scatter over the parsley, if you like, and serve.",
            recipeImageId = R.drawable.image8
        ),
        Recipe(
            id = 9,
            title = "Spicy Onion Rings",
            meal = "Lunch",
            serves = "1 person",
            difficulty = "  Intermediate",
            ingredients= "Onion – use 1 medium to large onion.\n" +
                    "Flour – I use plain flour for this\n" +
                    "Cornflour – also known as cornstarch.\n" +
                    "Seasonings - salt, black pepper, paprika, cayenne pepper and crushed chillies.\n" +
                    "Water – I use sparkling water.\n" +
                    "Breadcrumbs – panko breadcrumbs are ideal.\n" +
                    "Oil – use any oil you prefer. I use sunflower oil.",
            steps = "1. Peel and carefully slice the onion into rings. Separate the rings and set them aside. In a small bowl, combine the flour, cornflour, salt, black pepper paprika, cayenne pepper and crushed chilies. Gradually add the water and mix until smooth then set aside and pour the panko breadcrumbs into a separate bowl.\n" +
                    "\n" +
                    "2. Dip one onion ring into the batter ensuring it gets fully coated. Allow any excess batter to dip off then dip the onion ring into the panko breadcrumbs and fully coat by turning it a few times in the breadcrumbs. Place the coated ring on a plate and repeat the process until all the onion rings are coated. Allow all the coated the onion rings to sit at room temperature for 20 minutes to allow the coating to fully set.\n" +
                    "\n" +
                    "3. Pour the oil in heavy duty (enough to fully cover the onion rings and allow to heat to around 160oC. Place a few onion rings into the oil and cook for around 1 - 2 minutes turning half way through. The onion rings will be golden brown when done. Place the cooked onion rings onto a plate lined with kitchen towel. Repeat the process until all the onion rings are cooked. Serve them with your favourite sauce.Recipe Tips\n" +
                    "This recipe makes a small batch of onion rings but you can easily double the recipe to make a larger batch.\n" +
                    "The centre rings may be too small to use. I usually store them in the fridge in an airtight container and I use them for cooking.",
            recipeImageId = R.drawable.image9
        ),
        Recipe(
            id = 10,
            title = "Sauteed Vegetables",
            meal = "Dinner",
            serves = "1 person",
            difficulty = "Intermediate",
            ingredients= "3 Tbsp olive oil\n" +
                    "1 medium red bell pepper, chopped\n" +
                    "2 medium carrots, peeled and sliced fairly thin (1 cup)\n" +
                    "1/2 medium red onion, chopped (1 cup)\n" +
                    "2 1/2 cups broccoli florets (cut into bite size pieces)\n" +
                    "1 medium yellow squash, thick portion halved, all sliced\n" +
                    "1 1/2 tsp minced garlic\n" +
                    "1 1/2 tsp fresh thyme leaves (can sub 1/2 tsp dried)\n" +
                    "Salt and freshly ground black pepper\n" +
                    "2 Tbsp chopped fresh parsley\n" +
                    "1 1/2 tsp fresh lemon juice\n" +
                    "1/4 cup grated parmesan, optional",
            steps = "1. Heat oil in pan: Heat olive oil in a 12-inch skillet over medium-high heat.\n" +
                    "2. Saute crisp veggies: Add bell pepper, carrots, onion and broccoli. Saute 4 minutes (toss just occasionally so it can brown slightly).\n" +
                    "3. Then add soft veggie: Add squash, saute 3 minutes.\n" +
                    "4. Add seasonings, saute till tender: Toss in garlic, thyme and season with salt and pepper to taste. Saute 2 minutes or until veggies are just tender.\n" +
                    "5. Garnish: Sprinkle with parlsey and lemon juice, toss. Serve with parmesan if desired.Helpful Tips\n" +
                    "Use fresh vegetables and not frozen. They’ll finish with a better texture.\n" +
                    "Saute the crisp vegetables first (those like broccoli, cauliflower and onions) and add softer vegetables later so they don’t get mushy (those like squash, zucchini and tomatoes).\n" +
                    "Crank the heat up fairly high and only toss occasionally so the veggies get a bit of browning.\n" +
                    "Season with salt and other flavorings so they don’t taste flat and boring.\n" +
                    "Use a fair amount of oil when sautéing vegetables. For browning, moisture and flavor.",
            recipeImageId = R.drawable.image10
        ),

        )
}
class Item:
  pay_rate = 0.8
  all = []
  def __init__(self, name: str, price: float, quantity = 0):
    # Validate the values and change the error message
    assert price >= 0, f"{price} is not greater or equal to zero"
    assert quantity >= 0, f"{quantity} is not greater or equal to zero"
    

    # Assign fields to an object
    self.name = name   
    self.price = price
    self.quantity = quantity

    # Make actions
    Item.all.append(self)

  def calculate_total_price(self):
    return self.price * self.quantity

  def apply_discount(self):
    self.price = self.price * self.pay_rate

  # Change the way a object is represented
  def __repr__(self):
    return f"Item('{self.name}', {self.price}, {self.quantity})"

item1 = Item("Phone", 100, 1)
item2 = Item("Laptop", 1000, 3)
item3 = Item("Cable", 10, 5)
item4 = Item("Mouse", 50, 5)
item5 = Item("Keyboard", 75, 5)

# item2.has_numpad = False //You can add atributes to certain objects 

# print(Item.__dict__) # All the atributes of that class
# print(item1.__dict__) # The atributes that belong to that instance

# Call the method to update the value of price
# item1.apply_discount() 
# print(item1.price)
 

# Another item with a different discount
# item2.pay_rate = 0.7 
# item2.apply_discount()
# print(item2.price)

print(Item.all)  # Shows the number of instances
#for instances in Item.all: The names of the intances
#  print(instances.name)


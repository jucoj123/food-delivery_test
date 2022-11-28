from AbstractEvent import AbstractEvent
import json
from datetime import datetime

class Ordered(AbstractEvent):
    orderid : int
    foodid : str
    qty : str
    status : str
    customerid : str
    address : str
    
    def __init__(self):
        super().__init__()
        self.orderid = None
        self.foodid = None
        self.qty = None
        self.status = None
        self.customerid = None
        self.address = None



from AbstractEvent import AbstractEvent
import json

class Deliverystared(AbstractEvent):
    storeid : int
    orderid : str
    status : str
    customerid : str
    address : str
    
    def __init__(self):
        super().__init__()
        self.storeid = None
        self.orderid = None
        self.status = None
        self.customerid = None
        self.address = None


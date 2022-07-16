class Base:
    def __init__(self):
        pass

class File(Base):
    def __init__(self, file_name=None):
        self.file_name = file_name
        super().__init__()
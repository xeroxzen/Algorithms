import collections
# create a named tuple
Row = collections.namedtuple('Row', ['host', 'cpu', 'mem', 'disk'])
Row(host='r1', cpu=0.1, mem=0.2, disk=0.3)
# print the tuple
print(Row(host='r1', cpu=0.1, mem=0.2, disk=0.3))
